package com.mti.definicao;

import com.mti.modelo.Funcionario;

public class Pequisador {

  public static <T extends Nomeavel>T obterPorNome(T[] entidades, String nome) {
    for (T entidade : entidades) {
      if (entidade.getNome().equals(nome)) {
        return entidade;
      }
    }

    throw new RuntimeException("Esse funcionário não foi encontrado");
  }

}
