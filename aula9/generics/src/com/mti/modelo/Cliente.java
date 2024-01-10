package com.mti.modelo;

import com.mti.definicao.Nomeavel;

public class Cliente implements Nomeavel {

  private String nome;
  private double faturamento;

  public Cliente(String nome, double faturamento) {
    this.nome = nome;
    this.faturamento = faturamento;
  }
  @Override
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getFaturamento() {
    return faturamento;
  }
  public void setFaturamento(double faturamento) {
    this.faturamento = faturamento;
  }
  @Override
  public String toString() {
    return "Cliente [nome=" + nome + ", faturamento=" + faturamento + "]";
  }

}
