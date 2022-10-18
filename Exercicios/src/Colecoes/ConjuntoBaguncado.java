package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		conjunto.add("Teste"); //Não aceita itens repetidos
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		System.out.println("");
		
		System.out.println("conjunto.remove(\"teste\")\n" + conjunto.remove("teste"));
		System.out.println("conjunto.remove(\"Teste\")\n" + conjunto.remove("Teste"));
		
		System.out.println("");
		
		System.out.println("conjunto.contains('x')\n" + conjunto.contains('x'));
		
		
		@SuppressWarnings("rawtypes")
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	}

}
