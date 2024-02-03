package com.algaworks.junit.ecommerce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.algaworks.junit.ecommerce.exceptions.CarrinmhoCompraExceptiosn;

public class CarrinhoCompra {

	private final Cliente cliente;
	private final List<ItemCarrinhoCompra> itens;

	public CarrinhoCompra(Cliente cliente) {
		this(cliente, new ArrayList<>());
	}

	public CarrinhoCompra(Cliente cliente, List<ItemCarrinhoCompra> itens) {
		Objects.requireNonNull(cliente, "Cliente não pode ser nulo");
		Objects.requireNonNull(itens, "Lista não pode ser nula");
		this.cliente = cliente;
		this.itens = new ArrayList<>(itens); //Cria lista caso passem uma imutável
	}

	public List<ItemCarrinhoCompra> getItens() {
		//TODO deve retornar uma nova lista para que a antiga não seja alterada
		return new ArrayList<ItemCarrinhoCompra>(itens);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void adicionarProduto(Produto produto, int quantidade) {
		//TODO parâmetros não podem ser nulos, deve retornar uma exception
		if (isProdutoNull(produto)) {
			throw new CarrinmhoCompraExceptiosn("O carrinho não pode ser nulo");
		}
		
		//TODO quantidade não pode ser menor que 1
		if (isQuantidadeMinima(quantidade)) {
			throw new CarrinmhoCompraExceptiosn("A quantidade não pode ser nula ou menor do que 1");
		}
		
		//TODO deve incrementar a quantidade caso o produto já exista
		for(ItemCarrinhoCompra item : getItens()){
			if(produto.equals(item.getProduto())) {
				quantidade++;
			}
		}
		
		this.itens.add(new ItemCarrinhoCompra(produto, quantidade));
	}

	private boolean isQuantidadeMinima(int quantidade) {
		return quantidade < 1;
	}

	private boolean isProdutoNull(Produto produto) {
		return produto == null;
	}

	public void removerProduto(Produto produto) {
		//TODO parâmetro não pode ser nulo, deve retornar uma exception
		//TODO caso o produto não exista, deve retornar uma exception
		//TODO deve remover o produto independente da quantidade
	}

	public void aumentarQuantidadeProduto(Produto produto) {
		//TODO parâmetro não pode ser nulo, deve retornar uma exception
		//TODO caso o produto não exista, deve retornar uma exception
		//TODO deve aumentar em um quantidade do produto
	}

    public void diminuirQuantidadeProduto(Produto produto) {
		//TODO parâmetro não pode ser nulo, deve retornar uma exception
		//TODO caso o produto não exista, deve retornar uma exception
		//TODO deve diminuir em um quantidade do produto, caso tenha apenas um produto, deve remover da lista
	}

    public BigDecimal getValorTotal() {
		//TODO implementar soma do valor total de todos itens
		return null;
    }

	public int getQuantidadeTotalDeProdutos() {
		//TODO retorna quantidade total de itens no carrinho
		//TODO Exemplo em um carrinho com 2 itens, com a quantidade 2 e 3 para cada item respectivamente, deve retornar 5
		return 0;
	}

	public void esvaziar() {
		//TODO deve remover todos os itens
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CarrinhoCompra that = (CarrinhoCompra) o;
		return Objects.equals(itens, that.itens) && Objects.equals(cliente, that.cliente);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itens, cliente);
	}
}