package oo.abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
		
		System.out.println("---------cachorro---------");
		Animal cachorro = new Cachorro();
		
		System.out.println(cachorro.respirar());
		System.out.println(cachorro.mover());
		
		
		System.out.println("---------mamifero---------");
		
		
		
		Mamifero mamifero = new Mamifero() {
			
			@Override
			public String mamar() {
				return "Tomando leite..";
			}
		};
		
		System.out.println(mamifero.mamar());
		System.out.println(mamifero.mover());
		System.out.println(mamifero.respirar());
		
		
	}

}
