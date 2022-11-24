package oo.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Bia", "Lia", "Ana", "Gui");

		System.out.println("Tradicional method:");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda - Flexible method:");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		/* Na linha 18 a construção normal seria:
		 * aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); });
		 * Porém como é apenas uma única linha e uma única sentença de código, pode ser removido os () e as {} 
		 */

		System.out.println("\nLambda - Method Reference #1...");
		aprovados.forEach(System.out::println);

		System.out.println("\nLambda - Method Reference #2...");
		aprovados.forEach((nome -> meuImprimir(nome)));
		
		System.out.println("\nLambda - Method Reference with foreach #3...");
		aprovados.forEach(ForEach::meuImprimir);
	}

	static void meuImprimir(String nome) {
		System.out.println("Nome: " + nome);
	}
}
