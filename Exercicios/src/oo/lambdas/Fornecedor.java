package oo.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier não recebe nenhum parâmetro e te retorna algo.

/*
 * Note que quando não se passa nenhum parâmetro numa função
 * é necessário colocar o parâmetro como foi feito na linha 20.
 */

public class Fornecedor {
	
	public static void main(String[] args) {
		
		
		Supplier<List<String>> umLista =
				() -> Arrays.asList("Ana","Lia","Bia","Gui");
				
				
				System.out.println(umLista.get());
	}

}
