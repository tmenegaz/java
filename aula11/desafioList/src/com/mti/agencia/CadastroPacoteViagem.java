package com.mti.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CadastroPacoteViagem {

    // TODO declarar lista de pacotes de viagem aqui
    List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // TODO adicionar pacote na lista, validando antes se
        //  já existe usando contains (lançar exceção)
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);
        
        if (pacotes.contains(pacoteViagem)) {
            throw new PacoteDuplicadoException("Pacote em duplicidade");
        }

        pacotes.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        // TODO retornar lista de pacotes
        return pacotes;
    }

    public void ordenar() {
        // TODO ordenar pacotes pela ordem natural
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        // TODO ordenar pacotes pelo preço (decrescente)
        PacoteViagemComparator compara = new PacoteViagemComparator();
        pacotes.sort(compara.reversed());
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
        
        // int size = pacotes.size();
        // Iterator<PacoteViagem> pacote = pacotes.iterator();
        
        // while (pacote.hasNext()) {
        //     String alvo = pacote.next().getDescricao();
        //     if (alvo.equals(descricao)){
        //         pacote.remove();
        //     }
        // }

        Boolean removido = pacotes.removeIf(p -> p.getDescricao().equals(descricao));
        if (!removido) {
            throw new PacoteEsgotadoException("nenhum pacotes foi removido");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        PacoteViagem pacoteViagem = null;
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                pacoteViagem = pacote;
            }            
        }

        if (pacoteViagem == null){
            throw new PacoteNãoEncontradoException("Nenhum pacote foi encontrado");
        }
        return pacoteViagem;
    }

}

