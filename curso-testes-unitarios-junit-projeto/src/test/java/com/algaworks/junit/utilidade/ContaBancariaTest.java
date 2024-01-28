package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    public void testContaBancariaValida() {
        ContaBancaria conta = new ContaBancaria(new BigDecimal("1000.00"));
        assertNotEquals(null, conta.saldo());
    }

    @Test
    public void testContaBancariaNaoValida() {
        String nullPointerException = assertThrows(NullPointerException.class,
                () -> new ContaBancaria(null)
        ).getMessage();
        assertEquals("Não pode ser nulo", nullPointerException);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0",
            "null",
            "-1",
    }, nullValues = "null")
    public void testSaqueValorInvalido(BigDecimal valor) {
        ContaBancaria conta = new ContaBancaria(new BigDecimal("1000.00"));
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> conta.saque(valor));
        assertEquals("O valor não pode ser nulo, zero ou menor que zero", illegalArgumentException.getMessage());
    }

    @Test
    public void testSaqueSaldoInsificiente() {
        ContaBancaria conta = new ContaBancaria(new BigDecimal("1000.00"));
        RuntimeException runtimeException = assertThrows(RuntimeException.class,
                () -> conta.saque(new BigDecimal("10000.00")));
        assertEquals("Saldo insificiente", runtimeException.getMessage());
    }


    @ParameterizedTest
    @CsvSource(value = {
            "0",
            "null",
            "-1",
    }, nullValues = "null")
    public void testDepositoValorInvalido(BigDecimal valor) {
        ContaBancaria conta = new ContaBancaria(new BigDecimal("1000.00"));
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> conta.deposito(valor));
        assertEquals("O valor não pode ser nulo, zero ou menor que zero", illegalArgumentException.getMessage());
    }

    @Test
    public void testDepositoValido() {
        ContaBancaria conta = new ContaBancaria(new BigDecimal("1000.00"));
        conta.deposito(new BigDecimal("100.00"));
        assertEquals(1100d, conta.saldo().doubleValue());
    }

}