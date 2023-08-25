package io.github.apidesafiopicpay.enums;

public enum Document {
    CPF("CPF_ROLE"), CNPJ("CNPJ_ROLE");

    private String role;

    private Document(String role){
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
}
