package br.unip.poo2.padroes.templatemethod;

public abstract class Viagem {
	
	public final void realizarViagem() {
		realizarTransladoIda();
		realizarDiaA();
		realizarDiaB();
		realizarDiaC();
		realizarTransladoVolta();
	}

	protected abstract void realizarTransladoVolta();

	protected abstract void realizarDiaC();

	protected abstract void realizarDiaB();

	protected abstract void realizarDiaA();

	protected abstract void realizarTransladoIda();
}
