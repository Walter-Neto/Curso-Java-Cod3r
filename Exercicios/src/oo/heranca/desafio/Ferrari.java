package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari(){
		super(315);
	}
	
	Ferrari(int VelocidadeMaxima){
		super(VelocidadeMaxima);
		delta = 15;
	}
}
