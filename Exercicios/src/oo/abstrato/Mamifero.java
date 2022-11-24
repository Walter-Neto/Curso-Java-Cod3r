package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	public String mover() {
		return "Se moveu usando as patas..";
	}
	
	public abstract String mamar();
	
}
