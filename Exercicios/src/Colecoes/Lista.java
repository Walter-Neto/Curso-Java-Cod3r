package Colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Walter");
		
		lista.add(u1);
		lista.add(new Usuario("Morty"));
		lista.add(new Usuario("Rosinha"));
		lista.add(new Usuario("Lupi"));
		lista.add(new Usuario("Greg"));
		
		
		System.out.println(lista.get(2).nome + " - retornado pelo get.");
		System.out.println(lista.remove(0).nome + " - removido.");
		
		for(Usuario u:lista) {
			System.out.println("toString() - " + u.ToString());
		}
		
		
		System.out.println("Contains - " + lista.contains(new Usuario("Greg")));
		
		
		
	}
}