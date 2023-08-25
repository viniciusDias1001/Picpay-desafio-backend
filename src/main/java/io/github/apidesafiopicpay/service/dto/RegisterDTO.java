package io.github.apidesafiopicpay.service.dto;

import io.github.apidesafiopicpay.entity.document.Document;

public record RegisterDTO (
    String nomeCompleto,
    String email,
    String password,
    Document document){
}
