package Classe;

import java.util.Scanner;

public class DataProd {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia: ");
		int dia = entrada.nextInt();
		d1.dia = dia;
		System.out.println("Digite o mês: ");
		int mes = entrada.nextInt();
		d1.mes = mes;
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		d1.ano = ano;
		
		System.out.println(d1.obterDataFormatada());
		
		entrada.close();
	}

}
