package Arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAluno = new double[4];
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		notasAluno[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAluno));
		System.out.println("");
		
		System.out.println(notasAluno[0]);
		System.out.println("");
		
		System.out.println(notasAluno[notasAluno.length -1]);
		System.out.println("");
		
		double totalAluno = 0;
		for (int i = 0; i < notasAluno.length; i++) {
			double d = notasAluno[i];
			totalAluno += d;
			System.out.println(d);
		}
		System.out.println(totalAluno);
		
		
	}

}
