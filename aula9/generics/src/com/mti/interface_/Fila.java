package com.mti.interface_;

import java.util.Arrays;

public class Fila <F> implements Colecao<F> {

  private F[] itens;

  public Fila() {
    this.itens = (F[]) new Object[0];
  }

  @Override
  public void colocar(F item) {
    this.itens = Arrays.copyOf(this.itens, itens.length + 1);
    this.itens[this.itens.length - 1] = item;
  }

  @Override
  public F retirar() {

    if (this.itens.length == 0){
      throw new ColecaoVaziaException("A Fila está vazia");
    }

    F item = this.itens[0];
    this.itens = Arrays.copyOfRange(this.itens, 1, itens.length);

    return item;
  }
  

}
