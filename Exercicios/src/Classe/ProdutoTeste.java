package Classe;

public class ProdutoTeste {
	
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);		
		System.out.println(p1.precoComDesconto());
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;		
		
		System.out.printf("%.2f%n", p2.precoComDesconto());	
	}

}
