package io.github.apidesafiopicpay.config;

import io.github.apidesafiopicpay.entity.User;
import io.github.apidesafiopicpay.entity.document.Document;
import io.github.apidesafiopicpay.enums.DocumentEnum;
import io.github.apidesafiopicpay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestDataBase implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User usuarioAnderson = new User();
        usuarioAnderson.setNomeCompleto("Anderson Alexsandro Soares da Silva");
        usuarioAnderson.setEmail("anderson.silva.04@outlook.com");
        usuarioAnderson.setPassword("123456");
        usuarioAnderson.setDocument( new Document(DocumentEnum.CPF, "282.542.770-52"));

        userRepository.save(usuarioAnderson);
    }
}
