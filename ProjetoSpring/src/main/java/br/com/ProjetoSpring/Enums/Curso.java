package br.com.ProjetoSpring.Enums;

public enum Curso {
	
	ADMINISTRACAO("Administração"),
	INFORMATICA("Informática"),
	CONTABILIDADE("Contabilidade"),
	PROGRAMACAO("Programação"),
	ENFERMAGEM("Enfermagem");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso = curso;
	}

}
