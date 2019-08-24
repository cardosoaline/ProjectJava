package com.djg.emprestimolivro.dominio;

public class Usuario {
	
	public String codigoUsuario;
	public String nomeCompleto;
	public String dataNascimento;
	public String endereco;
	
	public void imprimeUsuario() {
		System.out.println("codigo "+codigoUsuario);
		System.out.println("Nome Completo "+nomeCompleto);
		System.out.println("Data de Nascimento "+dataNascimento);
		System.out.println("Endereço "+endereco);
	}

}
