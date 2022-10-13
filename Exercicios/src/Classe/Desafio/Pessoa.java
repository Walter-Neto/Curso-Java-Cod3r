package Classe.Desafio;

public class Pessoa {
	
	String nomeDaPessoa;
	double pesoDaPessoa;
	
	
	Pessoa(String nomeDaPessoa, double pesoDaPessoa){
		this.nomeDaPessoa = nomeDaPessoa;
		this.pesoDaPessoa = pesoDaPessoa;
	}
	
	
	void comer(Comida refeicao) {
		if(refeicao != null) {
			this.pesoDaPessoa += refeicao.pesoDaComida;
		}
	}
	
	String apresentar() {
		return "Olá, meu nome é " + this.nomeDaPessoa +
				" e estou pesando " + this.pesoDaPessoa +
				".";
	}

}
