package com.mti.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CadastroPacoteViagem {

    List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);
        
        if (pacotes.contains(pacoteViagem)) {
            throw new PacoteDuplicadoException("Pacote em duplicidade");
        }

        pacotes.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        PacoteViagemComparator compara = new PacoteViagemComparator();
        pacotes.sort(compara.reversed());
    }

    public void removerPorDescricao(String descricao) {
         int size = pacotes.size();

         Iterator<PacoteViagem> pacote = pacotes.iterator();
        
         while (pacote.hasNext()) {
             String alvo = pacote.next().getDescricao();
             if (alvo.equals(descricao)){
                 pacote.remove();
             }
         }

         if (size == pacotes.size()) {
            throw new PacoteEsgotadoException("nenhum pacotes foi removido");
        }

//        Boolean removido = pacotes.removeIf(p -> p.getDescricao().equals(descricao));
//        if (!removido) {
//            throw new PacoteEsgotadoException("nenhum pacotes foi removido");
//        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        PacoteViagem pacoteViagem = null;
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                pacoteViagem = pacote;
            }            
        }

        if (pacoteViagem == null){
            throw new PacoteNaoEncontradoException("Nenhum pacote foi encontrado");
        }
        return pacoteViagem;
    }

}

