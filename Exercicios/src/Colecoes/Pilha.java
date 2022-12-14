package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		/*
		 * peek() retorna o objeto sem remover, mas retorna null se a pilha estiver
		 * vazia.
		 */

		System.out.println(livros.peek());

		/*
		 * element() retorna o objeto sem remover, mas retorna null se a pilha estiver
		 * vazia.
		 */

		System.out.println(livros.element());

		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());

		// fila.size();
		// fila.clear();
		// fila.contains("...");
		// fila.isEmpity();

	}

}
