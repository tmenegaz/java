package br.com.mti.modelo;

import br.com.mti.interfaces.Calculadora;

import java.util.List;

public class CalculadoraImpl implements Calculadora {

    private double numero;
    private List<Double> numeros;
    private String operacao;


    public double getNumero() {
        return numero;
    }

    @Override
    public double operacao(List<Double> numeros, Character operacao) {

        switch (operacao) {
            case '+', '-' -> numeros.forEach(n -> numero += n);
            case '*' -> numeros.forEach(n -> {
                isZero();
                numero *= n;
            } );
            case '/' -> numero = numeros.get(0) / numeros.get(1);
        }
        return 0;
    }

    private void isZero() {
        if (numero == 0) {
            numero = 1;
        }
    }

    @Override
    public void resultado() {
        System.out.printf("%nResultado de %.2f %s (%.2f) = %.2f", numeros.get(0), operacao, numeros.get(1), numero);
    }
}
