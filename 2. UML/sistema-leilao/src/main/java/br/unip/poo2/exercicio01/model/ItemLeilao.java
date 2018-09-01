package br.unip.poo2.exercicio01.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ItemLeilao {

	private String nome;
	private String descricao;
	private double valorMinimo;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private List<Lance> lances;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public void iniciar() {
		// O campo "dataInicio" deve receber a data e hora atual.
		this.dataInicio = LocalDateTime.now();
		System.out.println(String.format("Item %s iniciado às %s.", this.nome, this.dataInicio));
	}
	
	public void registrarLance(Lance lance) {
		// Se necessario, inicializar a lista de lances.
		if (this.lances == null) {
			this.lances = new ArrayList<Lance>();
		}
		// Adicionar Lance a lista (historico).
		this.lances.add(lance);
	}
	
	public void finalizar() {
		// O campo "dataFim" deve receber a data e hora atual.
		this.dataFim = LocalDateTime.now();
		System.out.println(String.format("Item %s finalizado às %s.", this.nome, this.dataInicio));
	}
	
	public Lance buscarLanceVencedor() {
		// Caso existam lances, retornar o Lance de maior valor.
		// Caso contrario, retornar "null".
		Lance lanceVencedor = null;
		if (this.lances != null) {
			for (Lance lance : lances) {
				if (lanceVencedor == null || lance.getValor() > lanceVencedor.getValor()) {
					lanceVencedor = lance;
				}
			}
		}
		return lanceVencedor;
	}
}
