package Fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.concat(".");
		System.out.println(s);
		
		String nome = "Walter";
		nome = nome.toUpperCase()
				.concat("..")
				.replace("e", "i");
		
		System.out.println(nome);
		
		
	}

}
