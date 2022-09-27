package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {		
		
		/*
		 * A proposta do desafio é pedir que o usuário digite um dia da semana e
		 * terá que retornar no console o dia correspondente à aquele dia da semana
		 * utilizando a estrutura If Else If.
		 * 
		 * Domingo 1
		 * Segunda 2
		 * Terça 3
		 * Quarta 4
		 * Quinta 5
		 * Sexta 6
		 * Sábado 7
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();		
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
			
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		
		} else if (dia.equalsIgnoreCase("terça") ||
				(dia.equalsIgnoreCase("terca"))) {
			System.out.println(3);
			
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
			
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
			
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
			
		} else if (dia.equalsIgnoreCase("sábado") ||
				(dia.equalsIgnoreCase("sabado"))) {
			System.out.println(7);
		}
		
		entrada.close();
	}

}
