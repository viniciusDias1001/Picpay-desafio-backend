package io.github.apidesafiopicpay.entity.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "value")
public class CNPJ implements Document{
    private String value;
}
