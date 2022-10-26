package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	final String nomeDoAluno;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nomeDoAluno = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}	

	public String toString() {
		return nomeDoAluno;
	}
	
	Boolean possuiCurso(String verificaCurso) {
		for (Curso curso: this.cursos) {
			if (curso.nomeDoCurso.equalsIgnoreCase(verificaCurso)){
				return true;
			} else {
				return false;
			}
		}
		
		return null;
	}
	
}
