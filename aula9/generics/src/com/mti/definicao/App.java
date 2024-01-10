package com.mti.definicao;

import com.mti.modelo.Cliente;
import com.mti.modelo.Funcionario;

public class App {
  public static void main(String[] args) {
    
    Funcionario[] funcionarios = {
      new Funcionario("Patrícia", 36),
      new Funcionario("Rita", 40),
      new Funcionario("Jefferson", 24),
    };

    Funcionario funcionario = Pequisador.obterPorNome(funcionarios, "Rita");
    System.out.println(funcionario.getRazaoSocial());

    Cliente[] clientes = {
      new Cliente("Grimpa", 50000),
      new Cliente("Brew", 760000),
      new Cliente("Baoba", 850000)
    };

    Cliente cliente = Pequisador.obterPorNome(clientes, "Grimpa");
    System.out.println(cliente.getNome());
  }

}
