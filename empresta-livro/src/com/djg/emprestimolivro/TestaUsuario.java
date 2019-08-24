package com.djg.emprestimolivro;

import com.djg.emprestimolivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		
		
		Usuario usuario1 = new Usuario();
		usuario1.codigoUsuario = "1";
		usuario1.nomeCompleto = "Aline Lopes";
		usuario1.dataNascimento = "24/08/19";
		usuario1.endereco = "Rua.Sao Lopes";
		
		
		Usuario usuario2 = new Usuario();
		usuario2.codigoUsuario = "2";
		usuario2.nomeCompleto = " Lopes";
		usuario2.dataNascimento = "25/08/19";
		usuario2.endereco = "Rua.Sao Lopes";
		
		usuario1.imprimeUsuario();		
		usuario2.imprimeUsuario();		
		

		
		
	}

}
