package Controle;

import java.util.Scanner;

public class DesafioDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0.0;
		double totalDeNotas = 0.0;
		int i = 0;
		
		do {
			System.out.println("Digite a nota: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				totalDeNotas += nota;
				i++;				
			} else if(nota < -1 || nota > 10) {
				System.out.println("Digite uma nota válida.");
				nota = 0;
			}
		} while(nota != -1);
		
		double media =  totalDeNotas / i;
		System.out.println(media);

		
		entrada.close();
			
	}

}
