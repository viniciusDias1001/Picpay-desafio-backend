package io.github.apidesafiopicpay.entity.interfaces;

import io.github.apidesafiopicpay.entity.Statement;

import java.math.BigDecimal;
import java.util.List;

public interface Account {
    public void withdraw();
    public void transfer();
    public void deposit();
    public List<Statement> getStatement();
}
