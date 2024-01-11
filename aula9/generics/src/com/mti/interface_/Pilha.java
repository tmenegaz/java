package com.mti.interface_;

import java.util.Arrays;

public class Pilha<P> implements Colecao<P> {

  private P[] itens;

  public Pilha() {
    this.itens = (P[]) new Object[0];
  }

  @Override
  public P retirar() {

    if (this.itens.length == 0){
      throw new ColecaoVaziaException("A pilha está vazia");
    }

    P item = this.itens[this.itens.length - 1];
    this.itens = Arrays.copyOf(this.itens, itens.length - 1);

    return item;
  }

  @Override
  public void colocar(P item) {
    this.itens = Arrays.copyOf(this.itens, itens.length + 1);
    this.itens[this.itens.length - 1] = item;
  }

  
}
