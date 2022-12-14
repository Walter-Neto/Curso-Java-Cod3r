package Arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de alunos: ");
		int qntdAlunos = entrada.nextInt();
		System.out.println("Quantidade de notas por aluno: ");
		int qntdNotasAluno = entrada.nextInt();
		
		double [][] notasDaTurma = 
				new double[qntdAlunos][qntdNotasAluno];
		
		double totalDeNotas = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: %n", 
						n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				totalDeNotas += notasDaTurma[a][n];
			}
		}
		
		double mediaDaTurma = totalDeNotas / (qntdAlunos * qntdNotasAluno);
		System.out.println("Media da turma = " + mediaDaTurma);
		
		entrada.close();
	}
	
}
