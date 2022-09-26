package Fundamentos;

import java.util.Date;

public class Import {

	public static void main(String[] args) {

		/*
		 * Tanto o String quanto o System.out.println estão inclusos dentro do pacote
		 * java.lang, desse modo não precisamos deixar explícito conforme exemplos
		 * abaixo.
		 */
		java.lang.String b = "Boa tarde.";
		java.lang.System.out.println(b);

		String s = "Bom dia!";
		System.out.println(s);

		/*
		 * No exemplo abaixo a classe Date não está inclusa por padrão, desse modo é
		 * necessário realizar o import do pacote java.util.date.
		 * 
		 * O atalho no eclipse para realizar import é o ctrl + shift + o
		 */
		Date d = new Date();
		System.out.println(d);
		
		

	}

}
