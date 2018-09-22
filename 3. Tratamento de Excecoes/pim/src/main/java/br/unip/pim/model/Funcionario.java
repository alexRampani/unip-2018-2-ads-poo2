package br.unip.pim.model;

public class Funcionario extends Usuario {

	private String matricula;
	
	public void iniciarChamado(Chamado chamado) {
		chamado.iniciarChamado();
	}
	
	public void encerrarChamado(Chamado chamado) {
		chamado.encerrarChamado();
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
