package com.mti.agencia;

import java.util.Comparator;

public class PrecoHotelComparetor implements Comparator<Hotel> {
    @Override
    public int compare(Hotel hotel, Hotel t1) {
        return Double.compare(hotel.getPrecoDiaria(), t1.getPrecoDiaria());
    }
}
