package io.github.apidesafiopicpay.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.Date;
import java.util.List;
import java.util.Objects;

//@Entity(name = "EXTRATOS")
public class Statement {

//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "USER_ID")
//    private User user;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "extrato")
//    private List<Transfer> transfers;
//
//    private Date dateStament;
//
//    public Statement(User user, List<Transfer> transfers, Date dateStament) {
//        this.user = user;
//        this.transfers = transfers;
//        this.dateStament = dateStament;
//    }
//
//    public Statement() {
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public List<Transfer> getTransfers() {
//        return transfers;
//    }
//
//    public void setTransfers(List<Transfer> transfers) {
//        this.transfers = transfers;
//    }
//
//    public Date getDateStament() {
//        return dateStament;
//    }
//
//    public void setDateStament(Date dateStament) {
//        this.dateStament = dateStament;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Statement statement)) return false;
//        return Objects.equals(id, statement.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @Override
//    public String toString() {
//        return "Statement{" +
//                "user=" + user +
//                ", transfers=" + transfers +
//                ", dateStament=" + dateStament +
//                '}';
//    }
}
