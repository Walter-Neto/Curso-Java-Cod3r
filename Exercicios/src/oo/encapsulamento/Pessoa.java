package oo.encapsulamento;

class Pessoa {
	
	protected String nome;
	private int idade;
	
	protected Pessoa(){		
	}	
	
	protected Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade >= 0 && idade <= 130) {
			this.idade = idade;
			System.out.println("Idade atualizada!");
		}
		else {
			System.out.println("Idade Inválida.");
		}
	}

	public String toString() {
		return String.format("[Nome] = %s \n[Idade] = %d", 
				this.nome, this.idade);
	}

}
