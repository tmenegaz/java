package com.algaworks.junit.ecommerce;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarrinhoCompraTest {

  static Produto produtoA;
  static Produto produtoB;
  static Produto produtoC;
  static ItemCarrinhoCompra item1;
  static ItemCarrinhoCompra item2;
  static ItemCarrinhoCompra item3;
  static Cliente cliente;
  static List<ItemCarrinhoCompra> itens;

  @BeforeAll
  public static void setup() {
    produtoA = new Produto(1L, "Produto1", "descrição1", new BigDecimal("200"));
    produtoB = new Produto(1L, "Produto2", "descrição2", new BigDecimal("400"));
    produtoC = new Produto(1L, "Produto1", "descrição1", new BigDecimal("200"));
    item1 = new ItemCarrinhoCompra(produtoA, 10);
    item2 = new ItemCarrinhoCompra(produtoB, 100);
    item3 = new ItemCarrinhoCompra(produtoC, 1000);
    cliente = new Cliente(1L, "Cliente");
    itens = Arrays.asList(item1, item2, item3);
  }

  @Test
  public void testCarrinhoValido() {
    CarrinhoCompra carrinhoCompra = new CarrinhoCompra(cliente, itens);
    assertAll("Criar carrinho de compras",
        () -> assertEquals(carrinhoCompra.getCliente(), cliente),
        () -> assertEquals(carrinhoCompra.getItens(), itens));
  }

  @Test
  public void testCarrinhoClienteNaoValido() {
    String message = assertThrows(NullPointerException.class,
        () -> new CarrinhoCompra(null, itens)).getMessage();
        assertEquals("Cliente não pode ser nulo", message);
  }

  @Test
  public void testCarrinhoListaNaoValido() {
    String message = assertThrows(NullPointerException.class,
        () -> new CarrinhoCompra(cliente, null)).getMessage();
        assertEquals("Lista não pode ser nula", message);
  }

  @Test
  public void testListaItensValida() {
    CarrinhoCompra carrinhoCompra = new CarrinhoCompra(cliente, itens);
    assertIterableEquals(carrinhoCompra.getItens(), itens);
  }

  @Test
  public void testAdicionarProdutoValido() {
    CarrinhoCompra carrinhoCompra = new CarrinhoCompra(cliente, itens);
    carrinhoCompra.adicionarProduto(produtoA, 1);
    assertEquals(carrinhoCompra.getItens(), produtoA);
  }
}
