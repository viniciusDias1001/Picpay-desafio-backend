package io.github.apidesafiopicpay.service.dto;

public class RegisterDTO {

    private String nomeCompleto;
    private String email;
    private String password;
    private String document;


    public RegisterDTO(String nomeCompleto, String email, String password, String document) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.password = password;
        this.document = document;
    }


    public RegisterDTO() {
    }

    public String getLogin() {
        return nomeCompleto;
    }

    public void setLogin(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
