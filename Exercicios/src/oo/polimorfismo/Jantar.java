package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(97.6);
		
		convidado.comer(new Arroz(0.25));
		convidado.comer(new Feijao(0.2));
		convidado.comer(new Sorvete(0.4));
		
		System.out.println(convidado.getPeso());
	}

}
