package Classe;

public class EqualsHashCode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Walter";
		u1.email = "walter@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Walter";
		u2.email = "walter@gmail.com";
	
		
		System.out.println(u1 == u2);
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}
