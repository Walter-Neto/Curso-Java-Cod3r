package Controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();
		
		if (media <= 10.0 && media >= 7.0) {
			System.out.println("Parabens!");
			System.out.println("Aprovado!!");
		}
		
		if (media < 7.0 && media >= 4.5) {
			System.out.println("Recuperacao.");
		}
		
		boolean criterioReprovacaoAtingido = media < 4.5 && media > 0.0;
		
		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado.");
		}
		
		
		
		entrada.close();
		
	}

}
