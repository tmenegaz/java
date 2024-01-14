package com.mti.tree_set_arvore;

import java.util.Comparator;

public class ContatoIdadeComparator implements Comparator<Contato> {

    @Override
    public int compare(Contato contato, Contato t1) {
        return contato.getEmail().compareTo(t1.getEmail());
    }
}
