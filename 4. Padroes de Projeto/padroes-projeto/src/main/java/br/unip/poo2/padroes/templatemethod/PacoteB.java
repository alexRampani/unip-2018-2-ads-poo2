package br.unip.poo2.padroes.templatemethod;

public class PacoteB extends Viagem {

	@Override
	protected void realizarTransladoVolta() {
		System.out.println("Voltando Pacote B");
	}

	@Override
	protected void realizarDiaC() {
		System.out.println("Dia C Pacote B");
	}

	@Override
	protected void realizarDiaB() {
		System.out.println("Dia B Pacote B");
	}

	@Override
	protected void realizarDiaA() {
		System.out.println("Dia A Pacote B");
	}

	@Override
	protected void realizarTransladoIda() {
		System.out.println("Indo Pacote B");
	}
}
