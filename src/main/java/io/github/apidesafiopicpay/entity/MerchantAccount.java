package io.github.apidesafiopicpay.entity;

import io.github.apidesafiopicpay.entity.interfaces.Account;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class MerchantAccount implements Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    private BigDecimal saldo;
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;



    @Override
    public void withdraw() {

    }

    @Override
    public void transfer() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public List<Statement> getStatement() {
        return null;
    }
}
