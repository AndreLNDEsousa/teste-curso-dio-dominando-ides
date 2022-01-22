package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato(null, null, null);
		System.out.println(gato);
		
		Livro livro = new Livro();
        System.out.println(livro);

		/*
		 * int a=3; int b=2; System.out.println("olá mundo"+ "\n" + (a+b));
		 */

	}

}

class Livro {
    private String nome;
    private Integer numPaginas;
}
