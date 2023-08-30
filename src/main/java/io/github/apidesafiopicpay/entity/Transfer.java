package io.github.apidesafiopicpay.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity(name = "TRANSFERS")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User primaryUser;
    private User foremUser;
    private BigDecimal valor;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    Statement extrato;

    public Transfer(User primaryUser, User foremUser, BigDecimal valor, Statement extrato) {
        this.primaryUser = primaryUser;
        this.foremUser = foremUser;
        this.valor = valor;
        this.extrato = extrato;
    }

    public Transfer() {
    }

    public User getPrimaryUser() {
        return primaryUser;
    }

    public void setPrimaryUser(User primaryUser) {
        this.primaryUser = primaryUser;
    }

    public User getForemUser() {
        return foremUser;
    }

    public void setForemUser(User foremUser) {
        this.foremUser = foremUser;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Statement getExtrato() {
        return extrato;
    }

    public void setExtrato(Statement extrato) {
        this.extrato = extrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transfer transfer)) return false;
        return Objects.equals(id, transfer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "id=" + id +
                ", primaryUser=" + primaryUser +
                ", foremUser=" + foremUser +
                ", valor=" + valor +
                ", extrato=" + extrato +
                '}';
    }
}
