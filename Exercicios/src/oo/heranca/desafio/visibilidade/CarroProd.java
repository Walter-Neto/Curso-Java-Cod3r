package oo.heranca.desafio.visibilidade;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroProd {
	
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		System.out.println("[Civic] " + civic.toString());		
		
		Ferrari ferrari = new Ferrari();
		ferrari.ligarTurbo();
		ferrari.desligarTurbo();
		ferrari.ligarAr();
		System.out.println("[Ferrari] " + ferrari.toString());
		System.out.println(ferrari.nivelDoAr());
		
		System.out.println("-----------------------------");
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println("[Civic] " + civic.toString());		
		
		civic.frear();
		civic.frear();
		System.out.println("[Civic] " + civic.toString());	

		System.out.println("-----------------------------");
		
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println("[Ferrari] " + ferrari.toString());
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println("[Ferrari] " + ferrari.toString());
				
		
		System.out.println(ferrari.getDelta());
	}

}
