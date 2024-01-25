package br.com.mti.dominio;

import java.util.Objects;

public class Conta {

    private Long id;
    private String nome;
    private Usuario usuario;

    public Conta(Long id, String nome, Usuario usuario) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        Objects.requireNonNull(usuario, "Usuário é obrigatório");
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta conta)) return false;
        return Objects.equals(getId(), conta.getId()) && Objects.equals(getNome(), conta.getNome()) && Objects.equals(getUsuario(), conta.getUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getUsuario());
    }
}
