package com.mti.modelo;

import com.mti.definicao.Nomeavel;

public class Funcionario implements Nomeavel {

  private String razaoSocial;
  private int idade;
  public Funcionario(String razaoSocial, int idade) {
    this.razaoSocial = razaoSocial;
    this.idade = idade;
  }
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  @Override
  public String toString() {
    return "Funcionario [razaoSocial=" + razaoSocial + ", idade=" + idade + "]";
  }

  @Override
  public String getNome(){ return this.razaoSocial;}

}
