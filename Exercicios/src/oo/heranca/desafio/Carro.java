package oo.heranca.desafio;

public class Carro {
	
	
	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	protected Carro(final int VELOCIDADE_MAXIMA, int delta){
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
		this.delta = delta;
	}
		
	
	protected Carro(int VELOCIDADE_MAXIMA){
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
	}

	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString(){
		return String.format("Velocidade atual = %dkm/h.", velocidadeAtual)  ;
	}
}
