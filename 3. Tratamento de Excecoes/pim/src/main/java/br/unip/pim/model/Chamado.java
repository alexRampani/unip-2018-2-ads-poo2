package br.unip.pim.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Chamado {
	private long id;
	private String titulo;
	private String descricao;
	private String status;
	private LocalDateTime inicio;
	private LocalDateTime fim;

	public void abrirChamado() {
		System.out.println("Abrindo Chamado...");
	}
	
	public List<Chamado> buscarChamados() {
		System.out.println("Buscando Chamados...");
		return new ArrayList<>();
	}
	
	public void iniciarChamado() {
		System.out.println("Iniciando Chamado...");
	}
	
	public void encerrarChamado() {
		System.out.println("Encerrado Chamado...");
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

}
