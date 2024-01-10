package com.mti.banco;

public class ContaAtivaException extends RuntimeException {

  public ContaAtivaException(String message) {
    super(message);
  }

  public ContaAtivaException(String message, Throwable cause) {
    super(message, cause);
  }  

}
