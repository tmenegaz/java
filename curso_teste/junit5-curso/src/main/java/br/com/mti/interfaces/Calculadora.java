package br.com.mti.interfaces;

import java.util.List;

public interface Calculadora {
    double operacao(List<Double> numeros, Character operacao);
    void resultado();
}
