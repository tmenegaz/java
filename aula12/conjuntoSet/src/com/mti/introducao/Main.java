package com.mti.introducao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(100);
        numeros.add(20);
        numeros.add(200);
        numeros.add(30);
        numeros.add(300);
        numeros.add(40);
        numeros.add(400);
        numeros.add(null);

        System.out.println(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext()){
            Integer numero = iterator.next();
            System.out.println(numero);
        }
    }
}