package oo.heranca.desafio;

public class Carro {
	
	
	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	@SuppressWarnings("unused")
	private int delta = 5;
	
	protected Carro(final int VELOCIDADE_MAXIMA, int delta){
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
		this.delta = delta;
	}
		
	
	protected Carro(int VELOCIDADE_MAXIMA){
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
	}

	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
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


	public int getDelta() {
		return getDelta();
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
	
}
