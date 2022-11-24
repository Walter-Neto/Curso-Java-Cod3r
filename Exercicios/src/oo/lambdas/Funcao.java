package oo.lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		System.out.println(parOuImpar.apply(6));
		System.out.println(parOuImpar.apply(0));
		System.out.println(parOuImpar.apply(-1));

		Function<String,String> oResultadoE = 
				valor -> "Resultado = " + valor;
				
		Function<String,String>empolgado = valor -> valor + "!!!";
		
				
		String resultadoFinal = 
				parOuImpar.andThen(oResultadoE).
				andThen(empolgado).
				apply(32);
		
		System.out.println(resultadoFinal);
		
	}

}
