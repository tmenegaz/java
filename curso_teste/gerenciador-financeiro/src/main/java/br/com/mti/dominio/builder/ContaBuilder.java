package br.com.mti.dominio.builder;

import br.com.mti.dominio.Conta;
import br.com.mti.dominio.Usuario;

public class ContaBuilder {

    private Long id;
    private String nome;
    private Usuario usuario;

    private ContaBuilder() {}

    public static ContaBuilder novaConta() {
        ContaBuilder conta = new ContaBuilder();
        setPadrap(conta);
        return conta;
    }

    private static void setPadrap(ContaBuilder conta) {
        conta.id = 1L;
        conta.nome = "Conta corrente";
        conta.usuario = UsuarioBuilder.novoUsuario().agora();
    }

    public ContaBuilder comId(Long id) {
        this.id = id;
        return this;
    }
    public ContaBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }
    public ContaBuilder comUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Conta agora() {
        return new Conta(this.id, this.nome, this.usuario);
    }
}
