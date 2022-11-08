package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
		
	Pessoa(double peso){
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;			
		}
		else {
			System.out.println("Peso inválido.");
		}

	}

}
