package br.com.mti.dominio;

import br.com.mti.dominio.builder.ContaBuilder;
import br.com.mti.dominio.builder.UsuarioBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(1L, null, UsuarioBuilder.novoUsuario().agora(), "Nome é obrigatório"),
                Arguments.of(1L, "Usuário Válido", null, "Usuário é obrigatório")
        );
    }

    @Test
    public void testeCriarContaValida() {
        Conta conta = ContaBuilder.novaConta().agora();
        assertAll("Conta",
                () -> assertEquals(1L, conta.getId()),
                () -> assertEquals("Conta corrente", conta.getNome()),
                () -> assertEquals(UsuarioBuilder.novoUsuario().agora(), conta.getUsuario())
        );
    }

    @ParameterizedTest(name = "[{index}] - {3}")
    @DisplayName("Criar conta inválida: uso de parâmetros")
    @MethodSource(value = "dataProvider")
    public void deveRegeitarContaInvalida(Long id, String nome, Usuario usuario, String mensagem) {
        String excecaoMensagem = assertThrows(NullPointerException.class, () ->
                ContaBuilder.novaConta().comId(id).comNome(nome).comUsuario(usuario).agora()).getMessage();
        assertEquals(mensagem, excecaoMensagem);
    }
}
