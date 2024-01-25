package br.com.mti;

import br.com.mti.modelo.CalculadoraImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTest {


    List<Double> n = new ArrayList<>();
    CalculadoraImpl soma = new CalculadoraImpl();

    @BeforeEach
    public void setup() {}

    @Test
    public void testeSomar() {
        n.add(2d);
        n.add(3d);

        soma.operacao(n, '+');
        Assertions.assertEquals(5d, soma.getNumero(), "Soma");
    }

    @Test
    public void testeSubtracao() {
        n.add(2d);
        n.add(-3d);

        soma.operacao(n, '-');
        Assertions.assertEquals(-1d, soma.getNumero(), "Subtração");
    }

    @Test
    public void testeRetornaDivisaoExata() {
        n.add(6d);
        n.add(3d);

        soma.operacao(n, '/');
        Assertions.assertEquals(2d, soma.getNumero(), "Divisão exata");
    }

    @Test
    public void testeRetornaDivisaoNaoExata() {
        n.add(10d);
        n.add(3d);

        soma.operacao(n, '/');
        Assertions.assertEquals(3.33d, soma.getNumero(), 0.01, "Divisão não exata");
    }

    @Test
    public void testeFalhaComDivisorZero() {
        n.add(10d);
        n.add(0d);

        Assertions.assertEquals("Infinity", "Infinity");
    }
}
