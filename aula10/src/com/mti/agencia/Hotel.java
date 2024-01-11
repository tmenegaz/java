package com.mti.agencia;

import java.util.Objects;

public class Hotel {

    private String nome;
    private String cidade;
    private Double precoDiaria;

    public Hotel(String nome, String cidade, Double precoDiaria) {
        this.setNome(nome);
        this.setCidade(cidade);
        this.setPrecoDiaria(precoDiaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "O nome deve ser informado");
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        if (precoDiaria < 0){
            throw new IllegalArgumentException("O preço da diária não pode ser negativo");
        }
        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }
}
