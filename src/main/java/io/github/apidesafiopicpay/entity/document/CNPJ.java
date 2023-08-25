package io.github.apidesafiopicpay.entity.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class CNPJ implements Document{
    private String value;

    public CNPJ(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
