package oo.composicao;

public class CursoProd {
	
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Rosinha");
		Aluno aluno2 = new Aluno("Morty");
		Aluno aluno3 = new Aluno("Lupi");
		
		//System.out.println(aluno1);
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Git e Github");
		Curso curso3 = new Curso("AWS");
		
		curso1.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);
		
		//aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso1);
		
		
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Curso: " + curso3.nomeDoCurso);
			System.out.println("Aluno: " + aluno.nomeDoAluno);
			
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		System.out.println(aluno1.possuiCurso("AWS"));
		
		
		
		
		
	}

}
