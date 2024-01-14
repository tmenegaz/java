package com.mti.modelo;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {

    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codigoIbge=" + codigoIbge +
                ", nome='" + nome + '\'' +
                ", totalHabitantes=" + totalHabitantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cidade cidade)) return false;
        return getCodigoIbge() == cidade.getCodigoIbge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoIbge());
    }

    @Override
    public int compareTo(Cidade cidade) {
        return Integer.compare(cidade.getCodigoIbge(), getCodigoIbge());
    }
}
