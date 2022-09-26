package Fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		System.out.println("O raio sendo igual a 10, temos a area = " + area + " m2.");
	}

}
