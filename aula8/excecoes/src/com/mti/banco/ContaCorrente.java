package com.mti.banco;

import java.io.Serializable;

public class ContaCorrente implements Serializable {

  private String numero;
  private double saldo;
  private boolean ativo;

  public ContaCorrente(String numero) {
    this.numero = numero;
  } 

  public boolean isAtivo() {
    return ativo;
  }

  public boolean isInativo() {
    return !isAtivo();
  }

  public void ativar() {
    this.ativo = true;
  }

  public void desativar() {
    this.ativo = false;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNumero() {
    return numero;
  }

  public boolean depositar(double valor) throws ValorException {

    validaOperacao(valor);

      this.saldo += valor;
      return true;

  }

  public boolean sacar(double valor) throws ValorException {

    validaOperacao(valor);

    if (this.saldo < valor) {
      throw new IllegalArgumentException("Saldo insuficiente");

    }

      this.saldo -= valor;
      return true;
  }

  public boolean tranferir(ContaCorrente destino, double valor) throws ValorException{

    if (sacar(valor)) {
      destino.depositar(valor);
      return true;
    }

    return true;
  }

  private void validaOperacao(double valor) throws ValorException {
    
    if (isInativo()){
      throw new ContaAtivaException("Não é possível realizar a operação na conta inativa");
    }

    if (valor < 0){
      throw new ValorException("Não é possível realizar a operação com um valor negativo");
    }
  }

  

  

}
