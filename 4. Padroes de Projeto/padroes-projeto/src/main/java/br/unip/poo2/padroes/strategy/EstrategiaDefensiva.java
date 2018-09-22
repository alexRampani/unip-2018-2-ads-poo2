package br.unip.poo2.padroes.strategy;

public class EstrategiaDefensiva implements Estrategia {

	@Override
	public void executarComandoMover() {
		System.out.println("Movendo defensivamente...");
	}

}
