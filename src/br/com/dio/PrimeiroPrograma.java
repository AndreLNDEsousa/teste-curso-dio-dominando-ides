package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato(null, null, null); //gerou um erro e tive que colocar como nulo os dados da class Gato
		System.out.println(gato);
		
		Livro livro = new Livro();
        System.out.println(livro);

		
	}

}

class Livro {
    private String nome;
    private Integer numPaginas;
}
