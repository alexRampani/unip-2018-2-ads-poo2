package br.unip.poo2.exercicio01.model;

import java.util.List;

import br.com.caelum.stella.tinytype.CPF;

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
		// Implementar as seguintes regras antes registrar um Lance:
		// 1. Validar se o Lance atende ao valor mínimo do ItemLeilao;
		// 2. Validar CPF (desafio). Dica: biblioteca Caelum Stella.
		
		boolean retorno = false;
		
		if (lance.getValor() >= this.item.getValorMinimo()) {
			CPF cpf = new CPF(lance.getParticipante().getCpf());
			if (cpf.isValido()) {
				this.item.registrarLance(lance);
				System.out.println(String.format("Lance registrado (CPF %s): %.2f.", cpf, lance.getValor()));
				retorno = true;
			} else {
				System.err.println("Lance não registrado: CPF invalido.");
			}
		} else {
			System.err.println("Lance não registrado: valor mínimo.");
		}
		
		// Retornar "true" somente se o Lance for registrado.
		return retorno;
	}

	public void finalizar() {
		this.item.finalizar();
		this.itemIndice++;
	}

	public void imprimirRecibo() {
		// Recuperar o Lance vencedor para o ItemLeilao atual.
		
		Lance lanceVencedor = this.item.buscarLanceVencedor();
		
		// Caso haja um Lance vencedor, imprimir o seguinte:
		// 1. Nome do Participante do Lance vencedor;
		// 2. CPF do Participante do Lance vencedor;
		// 3. Nome do ItemLeilao;
		// 4. Valor do Lance vencedor.
		// Caso contrario, imprimir uma mensagem de erro.
		if (lanceVencedor != null) {
			System.out.println("----- INICIO RECIBO -----");
			System.out.println(String.format("Nome: %s", lanceVencedor.getParticipante().getNome()));
			System.out.println(String.format("CPF: %s", lanceVencedor.getParticipante().getCpf()));
			System.out.println(String.format("Item: %s", this.item.getNome()));
			System.out.println(String.format("Lance: %.2f", lanceVencedor.getValor()));
			System.out.println("----- FIM RECIBO -----");
		} else {
			System.err.println("Nenhum Lance registrado.");
		}
	}
}
