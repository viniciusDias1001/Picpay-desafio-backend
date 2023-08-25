package io.github.apidesafiopicpay.controller;


import io.github.apidesafiopicpay.entity.User;
import io.github.apidesafiopicpay.repository.UserRepository;
import io.github.apidesafiopicpay.service.TokenService;
import io.github.apidesafiopicpay.service.dto.AuthenticationDTO;
import io.github.apidesafiopicpay.service.dto.LoginResponseDTO;
import io.github.apidesafiopicpay.service.dto.RegisterDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("auth")

public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userService;

    @Autowired
    TokenService tokenService;

    public AuthenticationController(AuthenticationManager authenticationManager, UserRepository userService) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        var usernamePassword = new UsernamePasswordAuthenticationToken(authenticationDTO.getEmail(), authenticationDTO.getPassword());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

   @PostMapping("/new-register")
   @ResponseStatus(HttpStatus.CREATED)
  public User register(@RequestBody @Valid RegisterDTO registerDTO){
            if (registerDTO == null) return (User) ResponseEntity.badRequest();
         String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.getPassword());
          User newUser = new User(registerDTO.getNomeCompleto(), registerDTO.getEmail(),encryptedPassword, registerDTO.getDocument());
          userService.save(newUser);
          return newUser;
   }
}
