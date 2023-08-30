package io.github.apidesafiopicpay.entity;

import io.github.apidesafiopicpay.entity.interfaces.Account;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNTS")
public class SimpleAccount implements Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    private BigDecimal saldo;
    private BigDecimal credito;
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "conta")
    //comentando a relação e escondendo este atributo do JPA
    @Transient
    private List<Statement> extratos;

    public SimpleAccount(User user, BigDecimal saldo, BigDecimal credito, Date dataCriacao, List<Statement> extratos) {
        this.user = user;
        this.saldo = saldo;
        this.credito = credito;
        this.dataCriacao = dataCriacao;
        this.extratos = extratos;
    }

    public SimpleAccount() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Statement> getExtratos() {
        return extratos;
    }

    public void setExtratos(List<Statement> extratos) {
        this.extratos = extratos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleAccount simpleAccount)) return false;
        return Objects.equals(getId(), simpleAccount.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                ", saldo=" + saldo +
                ", credito=" + credito +
                ", dataCriacao=" + dataCriacao +
                '}';
    }

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
