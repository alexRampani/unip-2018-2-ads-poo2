package br.unip.poo2.padroes.strategy;

public class Robo {
	private Estrategia estrategia;
	
	public Estrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

	public void mover() {
		estrategia.executarComandoMover();
	}
}
