package br.unip.poo2.exercicio01.model;

public class Participante extends Pessoa {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void registrarLance(Leilao leilao, double valor) {
		Lance lance = new Lance();
		lance.setValor(valor);
		lance.setParticipante(this);
		leilao.registrarLance(lance );
	}
}
