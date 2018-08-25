package br.unip.poo2.exercicio01;

import java.time.LocalDateTime;
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
		// TODO O campo "dataInicio" deve receber a data e hora atual.
	}
	
	public void registrarLance(Lance lance) {
		// TODO Se necessario, inicializar a lista de lances.
		// TODO Adicionar Lance a lista (historico).
	}
	
	public void finalizar() {
		// TODO O campo "dataFim" deve receber a data e hora atual.
	}
	
	public Lance buscarLanceVencedor() {
		// TODO Caso existam lances, retornar o Lance de maior valor.
		// TODO Caso contrario, retornar "null".
		return null;
	}
}
