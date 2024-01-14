package com.mti.hash_espalamento;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Contato maria = new Contato("Maria", "maria@email.com", 18);
        Contato jose = new Contato("José", "jose@email.com", 21);
        Contato ana = new Contato("Ana", "ana@email.com", 36);
        Contato andre = new Contato("Andre", "ana@email.com", 55);
        Contato rosa = new Contato("Rosa", "maria@email.com", 41);

        Set<Contato> contatoSet = new HashSet<>();
        contatoSet.add(maria);
        contatoSet.add(jose);
        contatoSet.add(ana);
        contatoSet.add(andre);
        contatoSet.add(rosa);
        contatoSet.add(null);

        System.out.println(maria.hashCode());
        System.out.println(jose.hashCode());
        System.out.println(ana.hashCode());
        System.out.println(andre.hashCode());
        System.out.println(rosa.hashCode());

        System.out.println("-----------------");

        System.out.println(contatoSet);


    }
}
