package io.github.apidesafiopicpay.service.dto;

import io.github.apidesafiopicpay.entity.document.Document;

public class RegisterDTO {

    private String nomeCompleto;
    private String email;
    private String password;
    private Document document;


    public RegisterDTO(String nomeCompleto, String email, String password, Document document) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.password = password;
        this.document = document;
    }


    public RegisterDTO() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
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

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
