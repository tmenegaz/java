package com.mti.metodo;

import java.util.Random;

import com.mti.modelo.Cliente;

public class Sorteador {

  private static final Random RANDOM = new Random();

  public static <T> T sortear(T[] clientes) {
    
    if (clientes.length == 0) {
      throw new IllegalArgumentException("Não tem cliente");
    }

    var posicao = RANDOM.nextInt(clientes.length);
    return clientes[posicao];
  }
}
