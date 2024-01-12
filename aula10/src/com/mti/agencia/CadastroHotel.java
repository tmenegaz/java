package com.mti.agencia;

import java.util.ArrayList;

public class CadastroHotel {

  private final ArrayList<Hotel> hoteis = new ArrayList<>();

  public void adicionar(Hotel hotel) {
    if (hoteis.contains(hotel)) {
      throw new HotelDuplicadoException("Hotel em duplicidade");
    }
      hoteis.add(hotel);
  }

  public ArrayList<Hotel> obterTodos() {
      return hoteis;
  }
}
