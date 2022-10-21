package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		
		Queue <String> fila = new LinkedList<>();
		
		/*Tanto o método add como o offer servem para adicionar
		 * um elemento na fila.
		 * 
		 * A diferença entre eles é o retorno caso a fila esteja
		 * cheia. 
		 * 
		 * O add retornará false.
		 * O offer retornará uma exceção.
		 * 
		 */
		
		fila.add("Rosinha");
		fila.add("Zizi");
		fila.offer("Lupi");
		fila.offer("Greg");
		
		/* Tanto o método peek como o element servem para obter o
		 * próximo elemento na fila.
		 * 
		 * A diferença entre eles é o retorno caso a fila esteja
		 * vazia. 
		 * 
		 * O peek retornará null.
		 * O element retornará uma exceção.
		 * 
		 */
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		
		/* Tanto o método poll como o remove servem para remover
		 * um elemento na fila.
		 * 
		 * A diferença entre eles é o retorno caso a fila esteja
		 * vazia. 
		 * 
		 * O poll retornará null.
		 * O remove retornará uma exceção.
		 * 
		 */
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());	
		
		//fila.size();
		//fila.clear();
		//fila.contains("...");
		//fila.isEmpity();
		
	}

}
