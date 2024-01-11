package com.mti.classe;

import java.util.Arrays;

public class Pilha<P> {

  private P[] itens;

  public Pilha() {
    this.itens = (P[]) new Object[0];
  }

  public P retirar() {

    if (this.itens.length == 0){
      throw new PilhaVaziaException("A pilha está vazia");
    }

    P item = this.itens[this.itens.length - 1];
    this.itens = Arrays.copyOf(this.itens, itens.length - 1);

    return item;
  }

  public void colocar(P item) {
    this.itens = Arrays.copyOf(this.itens, itens.length + 1);
    this.itens[this.itens.length - 1] = item;
  }

  
}
