package br.com.mti.dominio;

import br.com.mti.dominio.builder.UsuarioBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static br.com.mti.dominio.builder.UsuarioBuilder.novoUsuario;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Domínio: Usuário")
public class UsuarioTeste {

    @Test
    @DisplayName("Criar usuário válido")
    public void testeCriarUsuarioValido() {
        Usuario usuario = novoUsuario().agora();
        assertAll("Usuário",
                () -> assertEquals(1L, usuario.getId()),
                () -> assertEquals("Usuário Válido", usuario.getNome()),
                () -> assertEquals("usuario@email.com", usuario.getEmail()),
                () -> assertEquals("123456", usuario.getSenha())
        );

    }

    @Test
    @DisplayName("Criar usuário não válido: nome é obrigatório")
    public void testeCriarUsuarioNaoValido() {
        NullPointerException nullPointerException = assertThrows(NullPointerException.class,
                () -> novoUsuario().comNome(null).agora());
        assertEquals("Nome é obrigatório", nullPointerException.getMessage());
    }

    @Test
    @DisplayName("Criar usuário não válido: email é obrigatório")
    public void testeCriarUsuarioComEmailNaoValido() {
        NullPointerException nullPointerException = assertThrows(NullPointerException.class,
                () -> novoUsuario().comEmail(null).agora());
        assertEquals("E-mail é obrigatório", nullPointerException.getMessage());
    }

    @Test
    @DisplayName("Criar usuário não válido: senha é obrigatório")
    public void testeCriarUsuarioComSenhaNaoValida() {
        NullPointerException nullPointerException = assertThrows(NullPointerException.class,
                () -> novoUsuario().comSenha(null).agora());
        assertEquals("Senha é obrigatória", nullPointerException.getMessage());
    }

    @DisplayName("Criar usuário não válido: uso de parâmetros")
    @ParameterizedTest(name = "[{index}] - {4}")
    @CsvSource(value = {
            "1, NULL, usuario@email.com, 123456, Nome é obrigatório",
            "1, Usuário Válido, NULL, 123456, E-mail é obrigatório",
            "1, Usuário Válido, usuario@email.com, NULL, Senha é obrigatória",
    }, nullValues = "NULL")
    public void testeCriarUsuarioInvalidoComParametros(Long id, String nome, String email, String senha, String mensagem) {
        NullPointerException nullPointerException = assertThrows(NullPointerException.class,
                () -> novoUsuario().comId(id).comNome(nome).comEmail(email).comSenha(senha).agora());
        assertEquals(mensagem, nullPointerException.getMessage());

    }
}
