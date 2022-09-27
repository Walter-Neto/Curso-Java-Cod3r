package Controle;

import java.util.Scanner;

public class DoWhile {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você vai ficar brabo nisso!");
			System.out.println("Deseja continuar? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		

		entrada.close();
	}
	
}
