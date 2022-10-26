package oo.composicao;

import java.util.ArrayList;

public class Curso {
	
	final String nomeDoCurso;
	
	final ArrayList<Aluno> alunos = new ArrayList<>();
		
	Curso(String nome){
		this.nomeDoCurso = nome;
	}	
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	
	
}
