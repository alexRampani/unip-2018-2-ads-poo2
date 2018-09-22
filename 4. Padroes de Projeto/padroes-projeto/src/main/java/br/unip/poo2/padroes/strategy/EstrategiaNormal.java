package br.unip.poo2.padroes.strategy;

public class EstrategiaNormal implements Estrategia {

	@Override
	public void executarComandoMover() {
		System.out.println("Movendo normalmente...");
	}

}
