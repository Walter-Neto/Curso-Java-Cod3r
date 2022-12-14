package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas serão computadas: ");
		int qntdNotas = entrada.nextInt();
		
		double [] notas = new double [qntdNotas];
		double totalDeNotas = 0.0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		for (double nota:notas) {
			totalDeNotas += nota;
		}
		
		double media = totalDeNotas / qntdNotas;
		System.out.println(media);
		
		entrada.close();
	}

}
