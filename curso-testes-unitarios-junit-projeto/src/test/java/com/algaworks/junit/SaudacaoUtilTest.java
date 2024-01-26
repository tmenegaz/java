package com.algaworks.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.algaworks.junit.utilidade.SaudacaoUtil;

public class SaudacaoUtilTest {

  String saudacao = null;

  @BeforeEach
  public void setup() {
    saudacao = SaudacaoUtil.saudar(9);
  }

  @Test
  public void testSaudacao() {
    assertEquals("Bom dia", saudacao);
  }

  @Test
  public void testSaudacaoException() {
    String exceptionMessage = assertThrows(IllegalArgumentException.class,
    () -> SaudacaoUtil.saudar(-10)).getMessage();
    assertEquals("Hora inválida", exceptionMessage);

  }
}
