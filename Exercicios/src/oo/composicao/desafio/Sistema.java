package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Walter");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Mouse", 326.60, 1);
		Compra compra2 = new Compra();
		compra2.adicionarItem("Teclado", 526.60, 1);
		
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}

}
