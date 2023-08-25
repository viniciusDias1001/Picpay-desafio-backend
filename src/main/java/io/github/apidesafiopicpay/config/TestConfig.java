package io.github.apidesafiopicpay.config;

import io.github.apidesafiopicpay.entity.User;
import io.github.apidesafiopicpay.entity.document.CPF;
import io.github.apidesafiopicpay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User usuarioAnderson = new User();
        usuarioAnderson.setNomeCompleto("Anderson Alexsandro Soares da Silva");
        usuarioAnderson.setEmail("anderson.silva.04@outlook.com");
        usuarioAnderson.setPassword("123456");
        usuarioAnderson.setDocument(new CPF("445.997.538.66"));

        userRepository.save(usuarioAnderson);
    }
}
