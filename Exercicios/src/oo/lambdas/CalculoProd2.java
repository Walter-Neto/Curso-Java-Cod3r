package oo.lambdas;

import java.util.function.BinaryOperator;

public class CalculoProd2 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x, y) -> {return x + y;};
		System.out.println(calculo.apply(1.0, 2.0));
		
		
		BinaryOperator<String> strin = (a, b) -> a + " " + b;
		System.out.println(strin.apply("Boa", "noite!"));
		
	}

}
