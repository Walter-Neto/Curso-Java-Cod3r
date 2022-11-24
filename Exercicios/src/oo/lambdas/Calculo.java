package oo.lambdas;

//@FunctionalInterface
public interface Calculo {
	
	
	/*
	 * Função abstrata | Posteriormente será chamada por
	 * uma lambda function.
	 */
	double executar(double a, double b);
	
	/*
	 * Função default - Ou seja, uma função definida em sua
	 * própria classe.
	 */
	default String legal() {
		return muitoLegal();
	}
	
	
	/*
	 * Método estático. OBS que um método de instância
	 * pode chamar um método estático mas um método estático
	 * não consegue chamar um método de instância.
	 */
	
	default String testeDoMetodoEstatico() {
		return "bacana";
	}
	
	static String muitoLegal() {
		/*O código da linha 34 geraria um erro.
		 * return testeDoMetodoEstatico();
		 */
		
		return "Muito legal!";
	}
	
	
}
