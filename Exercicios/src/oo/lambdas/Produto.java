package oo.lambdas;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoComDesconto = (preco * (1 - desconto));
		return String.format("%s custa R$ %.2f ", nome, precoComDesconto);
	}

}
