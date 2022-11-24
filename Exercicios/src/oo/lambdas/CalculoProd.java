package oo.lambdas;

public class CalculoProd {
	
	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> {return x + y;};
		System.out.println(calculo.executar(1, 2));
		
		calculo = new Multiplicar();
		
		System.out.println(calculo.executar(2, 3));
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
		
	}

}
