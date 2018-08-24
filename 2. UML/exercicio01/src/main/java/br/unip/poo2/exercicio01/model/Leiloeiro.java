package br.unip.poo2.exercicio01.model;

public class Leiloeiro extends Pessoa {

	public void iniciar(Leilao leilao) {
		leilao.iniciar();
	}

	public void finalizar(Leilao leilao) {
		leilao.finalizar();
	}

	public void imprimirRecibo(Leilao leilao) {
		leilao.imprimirRecibo();
	}

}
