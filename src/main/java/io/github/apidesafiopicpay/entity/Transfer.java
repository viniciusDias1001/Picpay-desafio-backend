package io.github.apidesafiopicpay.entity;

import io.github.apidesafiopicpay.entity.interfaces.Account;
import io.github.apidesafiopicpay.enums.TransferEnum;
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
    private Account sendAccount;
    @ManyToOne
    private Account reciveAccount;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private TransferEnum tipoTranferencia;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    Statement extrato;

    public Transfer(Account sendAccount, Account reciveAccount, BigDecimal valor, Statement extrato) {
        this.sendAccount = sendAccount;
        this.reciveAccount = reciveAccount;
        this.valor = valor;
        this.extrato = extrato;
    }

    public Transfer() {
    }

    public Account getSendAccount() {
        return sendAccount;
    }

    public void setSendAccount(Account sendAccount) {
        this.sendAccount = sendAccount;
    }

    public Account getReciveAccount() {
        return reciveAccount;
    }

    public void setReciveAccount(Account reciveAccount) {
        this.reciveAccount = reciveAccount;
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
                ", sanderAccount=" + sendAccount +
                ", reciverAccount=" + reciveAccount +
                ", valor=" + valor +
                ", extrato=" + extrato +
                '}';
    }
}
