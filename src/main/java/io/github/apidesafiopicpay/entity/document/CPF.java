package io.github.apidesafiopicpay.entity.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "value")
public class CPF implements Document{
    private String value;
}
