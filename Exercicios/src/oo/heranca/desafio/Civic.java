package oo.heranca.desafio;

public class Civic extends Carro {

	public Civic(){
		super(212);
	}
	
	
	public void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += 5;
		}
	}

}
