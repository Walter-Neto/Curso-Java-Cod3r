package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1 , "Walter");
		usuarios.put(20, "Rosinha");
		usuarios.put(3, "Greg");
		usuarios.put(4, "lupi");
		
		System.out.println("usuarios.size() - " + 
		usuarios.size());
		
		System.out.println("usuarios.isEmpty() - " +
		usuarios.isEmpty());
		
		System.out.println("usuarios.keySet() - " +
		usuarios.keySet());
		
		System.out.println("usuarios.values() - " + 
		usuarios.values());
		
		System.out.println("usuarios.containsKey(20) - " +
		usuarios.containsKey(20));
		
		System.out.println("usuarios.containsValue(\"Walter\") " + 
		usuarios.containsValue("Walter"));
		
		System.out.println("usuarios.get(4) - " + 
		usuarios.get(4));
		
		System.out.println("usuarios.remove(1) - " + 
		usuarios.remove(1));
		
		System.out.println("usuarios.remove(2, \"Rosinha\") - " +
				usuarios.remove(20, "Rosinha"));
		
		System.out.println("");
		
		for(int chave:usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("");
		
		for(String nome:usuarios.values()) {
			System.out.println(nome);
		}
		
		System.out.println("");
		
		for(java.util.Map.Entry<Integer, String> usuario:usuarios.entrySet()) {
			System.out.println(usuario);
		}	
	}
}
