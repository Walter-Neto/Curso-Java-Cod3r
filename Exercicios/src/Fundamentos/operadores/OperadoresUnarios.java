package Fundamentos.operadores;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		/*
		 *  Na linha abaixo retorna o resultado verdadeiro pois o incremento
		 *  ou decremento prefixado tem precedência sob a comparação.
		 *  
		 *   Já no caso do incremento ou decremento pós fixado, a compração
		 *   terá precedência.
		 */
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(++a == b--); 
		
		System.out.println(a == b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
