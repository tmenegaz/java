package com.algaworks.junit.utilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.algaworks.junit.utilidade.SaudacaoUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SaudacaoUtilTest {

  String saudacao = null;

  @BeforeEach
  public void setup() {
    saudacao = SaudacaoUtil.saudar(9);
  }

  @ParameterizedTest(name = "[{index}] - {1} às {0}h")
  @CsvSource(value = {
          "9, Bom dia",
          "15, Boa tarde",
          "20, Boa noite"
  })
  public void testSaudacao(int hora, String mensagem) {
    saudacao = SaudacaoUtil.saudar(hora);
    assertEquals(mensagem, saudacao);
  }

  @ParameterizedTest(name = "[{index}] - {1} -> {0}h")
  @CsvSource( value = {
          "-1, Hora inválida",
          "24, Hora inválida",
  })
  public void testSaudacaoException(int hora, String mensagem) {
    String exceptionMessage = assertThrows(IllegalArgumentException.class,
    () -> SaudacaoUtil.saudar(hora)).getMessage();
    assertEquals(mensagem, exceptionMessage);

  }
}
