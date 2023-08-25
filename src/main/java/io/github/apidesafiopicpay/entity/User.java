package io.github.apidesafiopicpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.apidesafiopicpay.entity.document.Document;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;



@Entity()
@Table(name = "USERS")
public class User implements UserDetails, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Email
    @NotBlank(message = "Email can't be null/blank")
    private String email;
    @NotBlank(message = "Nome Completo can't be null/blank")
    private String nomeCompleto;
    @NotBlank(message = "password can't be null/blank")
    private String password;
    @NotBlank(message = "Document can't be null/blank")
    @CPF
    @CNPJ
    @Embedded
    private Document document;


    public User() {
    }

    public User(Long id, String email, String nomeCompleto, String password, Document document) {
        this.id = id;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.password = password;
        this.document = document;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
