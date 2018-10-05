package br.unip.ads.pim.model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {
	
	private String matricula;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
