package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
//		int a = 2;
//		int b = 5;
		
//		System.out.println("Hello World! " + a + b);
		System.out.println(gato);
		System.out.println(livro);
		
	}
}

class Livro{
	
	private String nome;
	private String nPag;
	
}