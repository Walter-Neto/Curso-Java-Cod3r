package Fundamentos;

import java.util.Scanner;

public class ConsoleScanner {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.next();
		
		System.out.print("Sobrenome: ");
		String sobrenome = entrada.next();
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		entrada.close();
		
		System.out.printf("%s %s tem %d anos de idade.", nome, sobrenome, idade);
		
	}

}
