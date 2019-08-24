package com.djg.emprestimolivro.dominio;

public class Livros {
	
	private String codigoLivros;
	private String nome;
	private String autor;
	
	
	public String getCodigoLivros() {
		return codigoLivros;
	}


	public void setCodigoLivros(String codigoLivros) {
		this.codigoLivros = codigoLivros;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Livros(String codigoLivros, String nome, String autor) {
		super();
		this.codigoLivros = codigoLivros;
		this.nome = nome;
		this.autor = autor;
	}
	
	public void imprimeLivros() {
		System.out.println();
		System.out.println("Codigo do livro: "+codigoLivros);
		System.out.println("Nome do Livro "+nome);
		System.out.println("Autor: "+ autor);
	}

}
