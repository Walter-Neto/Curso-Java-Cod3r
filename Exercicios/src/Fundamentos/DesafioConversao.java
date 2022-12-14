package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro Salário: ");
		String primeiroSalarioString = entrada.next().replace(",", ".");
		double primeiroSalarioDouble = Double.parseDouble(primeiroSalarioString);
		
		System.out.print("\nDigite o segundo Salário: ");
		String segundoSalarioString = entrada.next().replace(",", "."); 
		double segundoSalarioDouble = Double.parseDouble(segundoSalarioString);
		
		System.out.print("\nDigite o terceiro Salário: ");
		String terceiroSalarioString = entrada.next().replace(",", ".");
		double terceiroSalarioDouble = Double.parseDouble(terceiroSalarioString);
		
		System.out.println("\nA soma dos salários é igual a " + 
		((primeiroSalarioDouble + segundoSalarioDouble + terceiroSalarioDouble)));		
		
		System.out.println("\nA média dos salários é igual a " + 
				((primeiroSalarioDouble + segundoSalarioDouble + terceiroSalarioDouble)/3));		
		
		entrada.close();		
	
	
	
	}

}
