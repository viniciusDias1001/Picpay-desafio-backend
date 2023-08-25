package io.github.apidesafiopicpay.entity.document;

import jakarta.persistence.Embeddable;

@Embeddable
public interface Document {
    String getValue();
}
