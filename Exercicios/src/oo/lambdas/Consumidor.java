package oo.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Consumer recebe um único argumento e não retorna nada.
 * 
 */

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 12.34, 0.25);
		Produto p3 = new Produto("Lapis", 3.20, 0.10);
		Produto p4 = new Produto("borracha", 4.19, 0.10);
		Produto p5 = new Produto("Caderno", 17.80, 0.10);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(System.out::println);
		
		
	}

}
