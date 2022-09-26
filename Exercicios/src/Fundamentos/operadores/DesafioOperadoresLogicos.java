package Fundamentos.operadores;

public class DesafioOperadoresLogicos {
	
	/*
	 * Temos o cenário que teremos a possibilidade de dois trabalhos para acontecer.
	 * Um será na terça e o outro no sábado. 
	 * 
	 * Se ao menos um trabalho acontecer, será comprada
	 * uma TV de 32".
	 * 
	 * Se os dois trabalhos acontecerem, será comprada
	 * uma TV de 50".
	 * 
	 * Sendo comprada uma TV ou duas, a família irá tomar sorvete para comemorar.
	 * 
	 * Se nenhum trabalho ocorrer, nenhuma TV será comprada e ninguém irá tomar sorvete.
	 */
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean tv50 = trabalho1 && trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("Trabalho da terça deu certo? " + trabalho1);
		System.out.println("Trabalho da quinta deu certo? " + trabalho2);
		System.out.println("A TV de 32\" foi comprada? " + tv32);
		System.out.println("A TV de 50\" foi comprada? " + tv50);
		System.out.println("A família tomou sorvete? " + sorvete);
		
	}

}
