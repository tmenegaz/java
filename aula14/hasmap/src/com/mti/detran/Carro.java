package com.mti.detran;

import java.util.Objects;

public class Carro  implements Comparable<Carro> {

    private final String placa;
    private final String modelo;

    public Carro(String placa, String modelo) {
        Objects.requireNonNull(placa, "A placa é obrigatória");
        Objects.requireNonNull(modelo, "O modelo é obrigatório");
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro carro)) return false;
        return Objects.equals(getPlaca(), carro.getPlaca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaca());
    }

    @Override
    public int compareTo(Carro carro) {
        return getPlaca().compareTo(carro.getPlaca());
    }
}
