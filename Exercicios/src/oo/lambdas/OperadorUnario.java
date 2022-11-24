package oo.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois.
				andThen(vezesDois).
				andThen(aoQuadrado).
				apply(0);
		
		System.out.println(resultado1);
		
		/*
		 * Note que o comportamento do apply e compose são parecidos.
		 * No entanto a forma de leitura é diferente e isso pode
		 * interferir no resultado.
		 * 
		 *  O apply() faz a leitura do começo para o final e o compose
		 *  faz a leitura do final para o começo.
		 */
		
		int resultado2 = aoQuadrado.
				compose(vezesDois).
				compose(maisDois).
				apply(0);
		
		System.out.println("Resultado2 = " + resultado2);
		
		
		
	}
	
	
	

}
