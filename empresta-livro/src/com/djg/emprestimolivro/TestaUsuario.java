package com.djg.emprestimolivro;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.djg.emprestimolivro.dominio.Emprestimo;
import com.djg.emprestimolivro.dominio.Livros;
import com.djg.emprestimolivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		
		
		Usuario usuario1 = new Usuario("aline","24/08/19","Rua Lopes Amaral");
		usuario1.setCodigoUsuario("1");
		
		Livros livro1 = new Livros("2","Ser Feliz","Max lucado");
		
		LocalDate dataEmprestimo = LocalDate.parse("2019-08-24",DateTimeFormatter.ISO_DATE);//Variavél local.
		LocalDate dataDevolucao = dataEmprestimo.plusDays(7);//Pesquisar Data .
		Emprestimo cadastro1 = new Emprestimo(null, usuario1, livro1,dataEmprestimo,dataDevolucao);
		
		
		Usuario usuario2 = new Usuario("Luiza ","25/08","Rua lemos 953");
		usuario2.setCodigoUsuario("2");
	//	usuario2.setNomeCompleto("Luiza Lopes"); 
	//	usuario2.setDataNascimento("25/08/19");
	//	usuario2.setEndereco("Rua.Sao Lopes");
		
		//Testando com Get e Set
		//System.out.println("Teste do get: "+ usuario1.getNomeCompleto());
		
		//usuario1.imprimeUsuario();		
		//usuario2.imprimeUsuario();	
		//livro1.imprimeLivros();
		
		
		cadastro1.emprestimo();
		


		
		
	}

}
