package br.com.mti.dominio;

import java.util.Objects;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(Long id, String nome, String email, String senha) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        Objects.requireNonNull(email, "E-mail é obrigatório");
        Objects.requireNonNull(senha, "Senha é obrigatória");

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(getId(), usuario.getId()) && Objects.equals(getNome(), usuario.getNome()) && Objects.equals(getEmail(), usuario.getEmail()) && Objects.equals(getSenha(), usuario.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getEmail(), getSenha());
    }
}
