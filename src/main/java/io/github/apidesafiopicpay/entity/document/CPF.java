package io.github.apidesafiopicpay.entity.document;

import jakarta.persistence.Embeddable;

@Embeddable
public class CPF implements Document{

    private String value;

    public CPF(String value) {
        this.value = value;
    }

    public CPF(){
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
