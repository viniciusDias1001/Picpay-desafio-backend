package io.github.apidesafiopicpay.service.dto;

public class LoginResponseDTO {

    String token;

    public LoginResponseDTO(String token) {
        this.token = token;
    }

    public LoginResponseDTO(){

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
