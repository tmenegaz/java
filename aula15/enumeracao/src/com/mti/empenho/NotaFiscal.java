package com.mti.empenho;

import com.mti.empenho.enums.Status;
import static com.mti.empenho.enums.Status.*;

public class NotaFiscal {

  private final Integer numero;
  private final String descricao;
  private final double valor;
  private int status = NAO_EMITIDA.getIndice();
//  private int status = EMITIDA.getIndice();

  public NotaFiscal(Integer numero, String descricao, double valor) {
      this.numero = numero;
      this.descricao = descricao;
      this.valor = valor;
  }

  public Integer getNumero() {
      return numero;
  }

  public String getDescricao() {
      return descricao;
  }

  public double getValor() {
      return valor;
  }

  public int getStatus() {
      return status;
  }

  public void cancelar() {
      if ((getStatus() == EMITIDA.ordinal() && (getValor() >= 10_000))
              || getStatus() == CANCELADA.ordinal()) {
          throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
      }

      status = CANCELADA.ordinal();
  }

  public void emitir() {
      if (getStatus() == EMITIDA.ordinal() || getStatus() == CANCELADA.ordinal()) {
          throw new IllegalStateException("Não foi possível emitir a nota fiscal");
      }

      status = EMITIDA.ordinal();
  }

  public String getDescricaoCompleta() {
      String descricaoStatus = switch (status) {
          case 0 -> NAO_EMITIDA.name();
          case 1 -> EMITIDA.name();
          case 2 -> CANCELADA.name();
          default -> throw new RuntimeException("Status não tratado");
      };

      return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
              getNumero(), getDescricao(), getValor(), descricaoStatus);
  }

}

