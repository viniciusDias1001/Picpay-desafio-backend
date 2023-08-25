package io.github.apidesafiopicpay.entity.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.apidesafiopicpay.enums.DocumentEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class Document {

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "DOCUMENT_TYPE")
    DocumentEnum document;

    @NotBlank
    @Column(name = "DOCUMENT_VALUE")
    String value;

    public Document(@JsonProperty("document")DocumentEnum document,@JsonProperty("value") String value){
        this.document = document;
        this.value = value;
    }

    public Document() {
    }

    public DocumentEnum getDocument() {
        return document;
    }

    public void setDocument(DocumentEnum document) {
        this.document = document;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
