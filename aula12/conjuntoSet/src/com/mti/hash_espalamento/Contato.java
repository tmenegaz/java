package com.mti.hash_espalamento;

import java.util.Objects;

public class Contato {

    private String nome;
    private String email;
    private Integer idade;

    public Contato(String nome, String email, Integer idade) {
        setNome(nome);
        setEmail(email);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Objects.requireNonNull(email, "E-mail é obrigatório");
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        System.out.printf("%n%s = %s%n", getEmail(), ((Contato) o).getEmail());
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getEmail(), contato.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }

}
