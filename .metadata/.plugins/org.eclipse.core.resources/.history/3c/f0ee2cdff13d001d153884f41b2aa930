package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	/*
	 * O Desafio consiste em criar uma calculadora simples que irá receber dois valores
	 * e após isso receberá um sinal de operação(+, -, *, / ou %);
	 * 
	 * Para resolução devemos utilizar apenas recursos que foram ensinados no curso até então.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação: ");
		String operacao = entrada.next();
		
		double conta = operacao.equals("-") ? num1 - num2 : 
			operacao.equals("+") ? num1 + num2 : 
				operacao.equals("*") ? num1 * num2 : 
					operacao.equals("/") ? num1 / num2 : num1 % num2;
		
		System.out.println(conta);		
		
		entrada.close();
	}

}
