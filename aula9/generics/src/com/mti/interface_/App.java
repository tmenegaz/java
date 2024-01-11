package com.mti.interface_;

import com.mti.modelo.Produto;

public class App {
  public static void main(String[] args) {
    
    Colecao<Produto> produtos = new Pilha<>();
    
    produtos.colocar(new Produto("Arroz"));
    produtos.colocar(new Produto("Feijão"));
    produtos.colocar(new Produto("Bife"));

    retirarTodos(produtos);

  }

  private static void retirarTodos(Colecao<?> objetos) {
    try {
      int i = 1;
      while (true) {
        Object objeto = objetos.retirar();
        System.out.printf("%d. %s%n", i, objeto);
        i++;        
      }
    } catch (ColecaoVaziaException e) {
      System.out.println("Pilha esgotada");
    }
  }

}
