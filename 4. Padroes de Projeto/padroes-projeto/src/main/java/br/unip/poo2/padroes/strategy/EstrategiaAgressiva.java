package br.unip.poo2.padroes.strategy;

public class EstrategiaAgressiva implements Estrategia {

	@Override
	public void executarComandoMover() {
		System.out.println("Movendo agressivamente...");
	}

}
