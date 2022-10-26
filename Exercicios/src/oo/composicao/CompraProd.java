package oo.composicao;

public class CompraProd {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Walter";
		compra1.adicionarItem("Café", 1, 10.05);
		compra1.adicionarItem(new Item("açúcar", 1, 10.05));
		compra1.adicionarItem(new Item("pão", 1, 10.05));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
	}

}
