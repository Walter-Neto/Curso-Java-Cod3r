package Fundamentos.operadores;

import java.util.Scanner;

public class ComparacaoDeStrings {
	
	public static void main(String[] args) {
		System.out.println("\"2\" == \"2\" " + ("2" == "2"));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número 2: ");
		String num2 = entrada.nextLine();
		
		System.out.println("Entrada do número 2 == \"2\" " + (num2 == "2"));
		
		//Abaixo, a forma correta de realizar comparações de String
		System.out.println(num2.equals("2")); //PARA COMPARAÇÃO DE STRING, UTILIZE O MÉTODO EQUALS.
		
		
		entrada.close();
		
		
		
	}

}
