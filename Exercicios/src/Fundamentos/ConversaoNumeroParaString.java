package Fundamentos;

public class ConversaoNumeroParaString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 20000;
		System.out.println(Integer.toString(num2).length());
		
		
		/*
		 * Essa estratégia de concatenar uma string vazia a um número não é uma boa prática, não use.
		 */
		System.out.println(("" + num1).length());
	}

}
