package io.github.apidesafiopicpay.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity(name = "STAMENTS")
public class Statement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CONTA_ID")
    private SimpleAccount conta;

    @Temporal(TemporalType.DATE)
    private Date dataInicial;

    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "extrato")
    List<Transfer> transferencias;



    public Statement(SimpleAccount conta, Date dataInicial, Date dataFinal, List<Transfer> transferencias) {
        this.conta = conta;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.transferencias = transferencias;
    }

    public Statement() {
    }

    public SimpleAccount getConta() {
        return conta;
    }

    public void setConta(SimpleAccount conta) {
        this.conta = conta;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public List<Transfer> getTransferencias() {
        return transferencias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Statement statement)) return false;
        return Objects.equals(id, statement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Statement{" +
                "id=" + id +
                ", conta=" + conta +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", transferencias=" + transferencias +
                '}';
    }
}
