package Fundamentos.operadores;

public class OperadorTernario {
	
	public static void main(String[] args) {
		double media = 5.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Em recuperação.";
		//System.out.println("Estudante: " + resultado);
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media > 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.printf("Estudante %s.\nBom comportamento: %b."
				+ "\nAprovado por média: %b."
				+ "\nTem direito a desconto: %b.", resultado, bomComportamento,
				passouPorMedia, temDesconto);
	}

}
