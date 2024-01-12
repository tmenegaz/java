package com.mti.agencia;

import java.util.*;

public class CadastroHotel {

  private final List<Hotel> hoteis = new ArrayList<>();

  public void adicionar(Hotel hotel) {
    if (hoteis.contains(hotel)) {
      throw new HotelDuplicadoException("Hotel em duplicidade");
    }
    hoteis.add(hotel);
  }

  public List<Hotel> obterTodos() {
    return hoteis;
  }

  public void remover(Hotel hotel) {
    if (!hoteis.contains(hotel)) {
      throw new HotelNaoEncontradoException("Hotel desconhecido");
    }
    boolean removido = hoteis.remove(hotel);
  }

  public void removerPorCidade(String cidade) {
    Iterator<Hotel> hotelItr = hoteis.iterator();
    while (hotelItr.hasNext()) {
      if (hotelItr.next().getCidade().equals(cidade)) {
        hotelItr.remove();
      }
    }
  }

  public void removerPorNome(String nome) {
    hoteis.removeIf(hotel -> hotel.getNome().equals(nome));
  }

  public void ordenar() {
    Collections.sort(hoteis);
  }

  public void ordenarPorPreco() {
    hoteis.sort(new PrecoHotelComparetor().reversed().thenComparing(Comparator.naturalOrder()));
  }

}
