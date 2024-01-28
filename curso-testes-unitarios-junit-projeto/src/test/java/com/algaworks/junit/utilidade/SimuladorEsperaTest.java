package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SimuladorEsperaTest {

    @Test
    public void testEsperarNaoRetornaTimeOUt() {
        assertTimeoutPreemptively(Duration.ofSeconds(1L),
                () -> SimuladorEspera.esperar(Duration.ofMillis(10L)));
    }

}