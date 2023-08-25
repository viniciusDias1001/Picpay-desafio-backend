package io.github.apidesafiopicpay.service.dto;

import io.github.apidesafiopicpay.entity.document.Document;

public class RegisterDTO {

    private String nomeCompleto;
    private String email;
    private String password;
    private Document documents;


    public RegisterDTO(String nomeCompleto, String email, String password, Document documents) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.password = password;
        this.documents = documents;
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
        return documents;
    }

    public void setDocument(Document documents) {
        this.documents = documents;
    }
}
