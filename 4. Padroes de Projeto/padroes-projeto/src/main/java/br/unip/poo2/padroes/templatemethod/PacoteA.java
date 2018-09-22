package br.unip.poo2.padroes.templatemethod;

public class PacoteA extends Viagem {

	@Override
	protected void realizarTransladoVolta() {
		System.out.println("Voltando Pacote A");
	}

	@Override
	protected void realizarDiaC() {
		System.out.println("Dia C Pacote A");
	}

	@Override
	protected void realizarDiaB() {
		System.out.println("Dia B Pacote A");
	}

	@Override
	protected void realizarDiaA() {
		System.out.println("Dia A Pacote A");
	}

	@Override
	protected void realizarTransladoIda() {
		System.out.println("Indo Pacote A");
	}
}
