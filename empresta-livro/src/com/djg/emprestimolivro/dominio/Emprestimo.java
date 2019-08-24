package com.djg.emprestimolivro.dominio;

import java.time.LocalDate;

public class Emprestimo {
	
	private String codigo;
	private Usuario usuarioSolicitante;
	private Livros livroEmprestado;
	private LocalDate dataSolicitacao ;
	private LocalDate dataDevolucao ;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Usuario getUsuarioSolicitante() {
		return usuarioSolicitante;
	}
	public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}
	public Livros getLivroEmprestado() {
		return livroEmprestado;
	}
	public void setLivroEmprestado(Livros livroEmprestado) {
		this.livroEmprestado = livroEmprestado;
	}
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	public Emprestimo(String codigo, Usuario usuarioSolicitante, Livros livroEmprestado,
			LocalDate dataSolicitacao, LocalDate dataDevolucao) {
		super();
		this.codigo = codigo;
		this.usuarioSolicitante = usuarioSolicitante;
		this.livroEmprestado = livroEmprestado;
		this.dataSolicitacao = dataSolicitacao;
		this.dataDevolucao = dataDevolucao;
	}
	
	public void emprestimo() {
		
	System.out.println("Nome do cliente: "+getUsuarioSolicitante().getNomeCompleto());	
	System.out.println("Nome do livro: "+getLivroEmprestado().getNome());
	System.out.println("Nome do Autor: "+getLivroEmprestado().getAutor());
	System.out.println("Data do emprestimo: "+dataSolicitacao);
	System.out.println("Data da devolução: "+dataDevolucao);
		
		
	}

}
