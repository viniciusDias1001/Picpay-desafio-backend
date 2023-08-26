package io.github.apidesafiopicpay.entity;

import jakarta.persistence.ManyToOne;

public class Transfer {
    User localUser;
    User fromUser;
    @ManyToOne
    Statement statement;
}
