package io.github.apidesafiopicpay.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONTA")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    private BigDecimal saldo;
    private BigDecimal credito;
    private Date dataCriacao;
}
