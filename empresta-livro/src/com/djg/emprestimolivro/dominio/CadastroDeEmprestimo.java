package com.djg.emprestimolivro.dominio;

public class CadastroDeEmprestimo {
	
	private String codigo;
	private Usuario usuarioSolicitante;
	private Livros livroEmprestado;
	private String dataSolicitacao ;
	private String dataDevolucao ;
	
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
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	public CadastroDeEmprestimo(String codigo, Usuario usuarioSolicitante, Livros livroEmprestado,
			String dataSolicitacao, String dataDevolucao) {
		super();
		this.codigo = codigo;
		this.usuarioSolicitante = usuarioSolicitante;
		this.livroEmprestado = livroEmprestado;
		this.dataSolicitacao = dataSolicitacao;
		this.dataDevolucao = dataDevolucao;
	}
	
	public void cadastroEmprestimo() {
		
	System.out.println(getUsuarioSolicitante().getNomeCompleto());
	System.out.println(getLivroEmprestado().getNome());
	System.out.println(dataSolicitacao);
	System.out.println(dataDevolucao);
	
		
		
	}

}
