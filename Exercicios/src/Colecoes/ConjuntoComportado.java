package Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		//Set não respeita ordem de inserção
		//Set<String> listaAprovados = new HashSet<>();
		
		/*
		 * TreeSet respeita ordem de inserção pois faz parte de
		 * um grupo de conjuntos ordenados.
		 */
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(70);
		
		for(int n:nums) {
			System.out.println(n);
		}
		
		
	}

}
