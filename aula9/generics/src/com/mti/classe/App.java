package com.mti.classe;

import com.mti.modelo.Produto;

public class App {
  public static void main(String[] args) {
    
    Pilha<Produto> pilha = new Pilha<>();
    
    pilha.colocar(new Produto("Arroz"));
    pilha.colocar(new Produto("Feijão"));
    pilha.colocar(new Produto("Bife"));

    Produto produto = pilha.retirar();
    System.out.println(produto.getNome());

    produto = pilha.retirar();
    System.out.println(produto.getNome());

  }

}
