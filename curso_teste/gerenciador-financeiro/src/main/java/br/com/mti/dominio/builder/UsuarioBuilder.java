package br.com.mti.dominio.builder;

import br.com.mti.dominio.Usuario;

public class UsuarioBuilder {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    private UsuarioBuilder() {}

    public static UsuarioBuilder novoUsuario() {
        UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
        setPadrap(usuarioBuilder);
        return usuarioBuilder;
    }

    private static void setPadrap(UsuarioBuilder usuarioBuilder) {
        usuarioBuilder.id = 1L;
        usuarioBuilder.nome = "Usuário Válido";
        usuarioBuilder.email = "usuario@email.com";
        usuarioBuilder.senha = "123456";
    }

    public UsuarioBuilder comId(Long id) {
        this.id = id;
        return this;
    }
    public UsuarioBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }
    public UsuarioBuilder comEmail(String email) {
        this.email = email;
        return this;
    }
    public UsuarioBuilder comSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public Usuario agora() {
        return new Usuario(this.id, this.nome, this.email, this.senha);
    }
}
