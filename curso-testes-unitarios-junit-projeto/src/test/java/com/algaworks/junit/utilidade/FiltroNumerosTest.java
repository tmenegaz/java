package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltroNumerosTest {

    @Test
    public void testNumerosParesValidos() {
        List<Integer> resultado = FiltroNumeros.numerosPares(Arrays.asList(0, 1, 2, 3, 4));
        assertIterableEquals(Arrays.asList(0,2,4), resultado);
    }

    @Test
    public void testNumerosImparesValidos() {
        List<Integer> resultado = FiltroNumeros.numerosImpares(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        assertIterableEquals(Arrays.asList(1,3,5,7), resultado);
    }

    @Test
    public void testIsPositivoValido() {
        boolean positivo = FiltroNumeros.isPositivo(1);
        assertTrue(positivo);
    }

    @Test
    public void testIsPositivoNaoValido() {
        boolean positivo = FiltroNumeros.isPositivo(-1);
        assertFalse(positivo);
    }

}