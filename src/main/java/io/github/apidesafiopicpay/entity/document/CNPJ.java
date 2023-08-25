package io.github.apidesafiopicpay.entity.document;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Embeddable
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
