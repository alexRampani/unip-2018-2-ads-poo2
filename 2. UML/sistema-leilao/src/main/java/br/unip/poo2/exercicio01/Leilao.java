package br.unip.poo2.exercicio01;

import java.util.List;

public class Leilao {
	private Leiloeiro leiloeiro;
	private List<ItemLeilao> itens;
	private ItemLeilao item;
	private int itemIndice = 0;

	public Leilao(Leiloeiro leiloeiro, List<ItemLeilao> itens) {
		this.leiloeiro = leiloeiro;
		this.itens = itens;
	}

	public Leiloeiro getLeiloeiro() {
		return leiloeiro;
	}

	public void setLeiloeiro(Leiloeiro leiloeiro) {
		this.leiloeiro = leiloeiro;
	}

	public List<ItemLeilao> getItens() {
		return itens;
	}

	public void setItens(List<ItemLeilao> itens) {
		this.itens = itens;
	}

	public ItemLeilao getItem() {
		return item;
	}

	public void setItem(ItemLeilao item) {
		this.item = item;
	}

	public void iniciar() {
		if (this.itemIndice < this.itens.size()) {
			this.item = this.itens.get(itemIndice);
			this.item.iniciar();
		} else {
			System.err.println("Nao existem mais itens para Leilao");
		}
	}

	public boolean registrarLance(Lance lance) {
		// TODO Implementar as seguintes regras antes registrar um Lance:
		// 1. Validar se o Lance atende ao valor mínimo do ItemLeilao;
		// 2. Validar CPF (desafio). Dica: biblioteca Caelum Stella.
		
		this.item.registrarLance(lance);
		
		// TODO Retornar "true" somente se o Lance for registrado.
		return false;
	}

	public void finalizar() {
		this.item.finalizar();
		this.itemIndice++;
	}

	public void imprimirRecibo() {
		// TODO Recuperar o Lance vencedor para o ItemLeilao atual.
		
		// TODO Caso haja um Lance vencedor, imprimir o seguinte:
		// 1. Nome do Participante do Lance vencedor;
		// 2. CPF do Participante do Lance vencedor;
		// 3. Nome do ItemLeilao;
		// 4. Valor do Lance vencedor.
		// TODO Caso contrario, imprimir uma mensagem de erro.
	}
}
