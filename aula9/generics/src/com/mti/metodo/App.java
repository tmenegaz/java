package com.mti.metodo;

import com.mti.modelo.Cliente;

public class App {
  
  public static void main(String[] args) {

    String[] nomes = {"Tiago", "Laiz", "Stela", "Letícia", "Luiza"};
    System.out.println(Sorteador.<String>sortear(nomes));
    
    Integer[] notas = {1, 5, 9, 11, 55, 99};
    System.out.println(Sorteador.<Integer>sortear(notas));
    
    Cliente[] clientes = {
      new Cliente("Grimpa", 50000),
      new Cliente("Brew", 760000)
    };
    
    Cliente sorteado = Sorteador.<Cliente>sortear(clientes);
    System.out.println(sorteado);
  }
  

}
