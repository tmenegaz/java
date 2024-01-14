package com.mti.tree_set_arvore;

import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Contato maria = new Contato("Maria", "maria@email.com", 18);
        Contato jose = new Contato("José", "jose@email.com", 21);
        Contato ana = new Contato("Ana", "ana@email.com", 36);
        Contato andre = new Contato("Andre", "andre@email.com", 55);
        Contato rosa = new Contato("Rosa", "rosa@email.com", 41);

        Set<Contato> contatoSet = new TreeSet<>(new ContatoIdadeComparator());
        contatoSet.add(maria);
        contatoSet.add(jose);
        contatoSet.add(ana);
        contatoSet.add(andre);
        contatoSet.add(rosa);

        System.out.println("-----------------");

        for (Contato contato : contatoSet) {
            System.out.println(contato);
        }


    }
}
