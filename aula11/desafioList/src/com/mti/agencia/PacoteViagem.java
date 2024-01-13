package com.mti.agencia;

import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem> {

    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        Objects.requireNonNull(descricao);

        if (precoPorPessoa < 0) {
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
        }

        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoPorPessoa=" + precoPorPessoa +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PacoteViagem other = (PacoteViagem) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    @Override
    public int compareTo(PacoteViagem o) {
        return getDescricao().compareTo(o.descricao);
    }

    

}

