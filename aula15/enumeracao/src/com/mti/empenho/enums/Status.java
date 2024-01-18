package com.mti.empenho.enums;

public enum Status {
    NAO_EMITIDA(0),
    EMITIDA(1),
    CANCELADA(2);

    private final int indice;

    Status(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }
}
