package com.mti.agencia;

public class HotelNaoEncontradoException extends RuntimeException {
    public HotelNaoEncontradoException(String message) {
        super(message);
    }
}
