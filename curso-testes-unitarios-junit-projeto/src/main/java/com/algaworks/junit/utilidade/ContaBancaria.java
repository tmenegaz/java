package com.algaworks.junit.utilidade;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaBancaria {

    private BigDecimal saldo;

    public ContaBancaria(BigDecimal saldo) {
        //TODO 1 - validar saldo: não pode ser nulo, caso seja, deve lançar uma IllegalArgumentException
        //TODO 2 - pode ser zero ou negativo
        Objects.requireNonNull(saldo, "Não pode ser nulo");
        this.saldo = saldo;

    }

    public void saque(BigDecimal valor) {
        //TODO 1 - validar valor: não pode ser nulo, zero ou menor que zero, caso seja, deve lançar uma IllegalArgumentException
        //TODO 2 - Deve subtrair o valor do saldo
        //TODO 3 - Se o saldo for insuficiente deve lançar uma RuntimeException
        if (isPositivo(valor)) {
            throw new IllegalArgumentException("O valor não pode ser nulo, zero ou menor que zero");
        }

        if (!temSaldo(valor)) {
            throw new RuntimeException("Saldo insificiente");
        }

        this.saldo = this.saldo.subtract(valor);
    }

    public void deposito(BigDecimal valor) {
        //TODO 1 - validar valor: não pode ser nulo, zero ou menor que zero, caso seja, deve lançar uma IllegalArgumentException
        //TODO 2 - Deve adicionar o valor ao saldo
        if (isPositivo(valor)) {
            throw new IllegalArgumentException("O valor não pode ser nulo, zero ou menor que zero");
        }

        this.saldo = this.saldo.add(valor);
    }

    public BigDecimal saldo() {
        //TODO 1 - retornar saldo
        return saldo;
    }

    private boolean temSaldo(BigDecimal valor) {
        return this.saldo().doubleValue() >= valor.doubleValue();
    }

    private boolean isPositivo(BigDecimal valor) {
        return valor == null || valor.doubleValue() <= 0;
    }
}
