package br.unip.poo2.exercicio01.model;

import java.util.List;

import br.com.caelum.stella.tinytype.CPF;

public class Leilao {

	private Leiloeiro leiloeiro;

	private List<ItemLeilao> itens;

	private ItemLeilao item;

	private int itemIdx;

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
		if (this.itens != null && itemIdx < this.itens.size()) {
			this.item = this.itens.get(itemIdx);
			this.item.iniciar();
		} else {
			System.err.println("Não existem mais itens para leilão.");
		}
	}

	public void finalizar() {
		this.item.finalizar();
		itemIdx++;
	}

	public void imprimirRecibo() {
		Lance lance = this.item.buscarLanceVencedor();
		if (lance != null) {
			System.out.println("----- INICIO RECIBO -----");
			System.out.println(String.format("Nome: %s", lance.getParticipante().getNome()));
			System.out.println(String.format("CPF: %s", lance.getParticipante().getCpf()));
			System.out.println(String.format("Item: %s", this.item.getNome()));
			System.out.println(String.format("Valor: %.2f", lance.getValor()));
			System.out.println("----- FIM RECIBO -----");
		} else {
			System.err.println(String.format("Nenhum lance para o item %s.", this.item.getNome()));
		}
	}

	public boolean registrarLance(Lance lance) {
		String cpf = lance.getParticipante().getCpf();
		boolean isCpfValido = new CPF(cpf).isValido();
		if (isCpfValido) {
			// TODO Validar se o lance é maior ou igual ao valor mínimo.
			this.item.registrarLance(lance);
			System.out.println(String.format("Lance relalizado (CPF %s): R$%.2f.", cpf, lance.getValor()));
		} else {
			System.err.println(String.format("Lance não relalizado (CPF %s inválido).", cpf));
		}
		return isCpfValido;
	}

}
