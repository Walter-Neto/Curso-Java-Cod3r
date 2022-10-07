package Classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioInformado){
		raio = raioInformado;		
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
