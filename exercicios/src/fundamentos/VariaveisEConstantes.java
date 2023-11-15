package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		
		final double PI = 3.14159;
		double raio = 3.4;
		
		double area = PI * raio * raio;
		
		System.out.println("Área = "+ area + " m2.");
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = "+ area + " m2.");
		
		
	}

}
