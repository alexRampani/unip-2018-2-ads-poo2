package br.unip.poo2.exercicio01;

import java.util.ArrayList;
import java.util.List;

import br.unip.poo2.exercicio01.model.ItemLeilao;
import br.unip.poo2.exercicio01.model.Lance;
import br.unip.poo2.exercicio01.model.Leilao;
import br.unip.poo2.exercicio01.model.Leiloeiro;
import br.unip.poo2.exercicio01.model.Participante;

public class Teste {

	public static void main(String[] args) {
		// Cria os Itens de Leilão
		ItemLeilao item1 = new ItemLeilao();
		item1.setNome("Gol 1.0");
		item1.setValorMinimo(2000.00);
		
		ItemLeilao item2 = new ItemLeilao();
		item2.setNome("Palio 1.0");
		item2.setValorMinimo(3000.00);
		
		// Cria uma lista para armazenar os Itens de Leilão
		List<ItemLeilao> itens = new ArrayList<>();
		itens.add(item1);
		itens.add(item2);
		
		// Cria o Leiloeiro para o Leilão
		Leiloeiro leiloeiro = new Leiloeiro();
		leiloeiro.setNome("João Silva");
		
		// Cria um Leilão, com Leiloeiro e Itens de Leilão
		Leilao leilao = new Leilao(leiloeiro, itens);
		
		// Inicia o Leilão (primeiro item iniciado)
		leilao.iniciar();
		
		// Cria os Participantes para os Lances
		Participante participante1 = new Participante();
		participante1.setNome("Pedro");
		participante1.setCpf("897.356.160-09");
		
		Participante participante2 = new Participante();
		participante2.setNome("Renan");
		participante2.setCpf("616.088.320-82");

		// Cria os Lances
		Lance lance1 = new Lance();
		lance1.setParticipante(participante1);
		lance1.setValor(2005.00);

		Lance lance2 = new Lance();
		lance2.setParticipante(participante2);
		lance2.setValor(2010.00);
		Lance lance3 = new Lance();
		lance3.setParticipante(participante1);
		lance3.setValor(2015.00);

		// Registra os Lances
		leilao.registrarLance(lance1);
		leilao.registrarLance(lance2);
		leilao.registrarLance(lance3);

		// Finaliza o Item de Leilão
		leilao.finalizar();

		// Imprime o recibo para o Vencedor
		leilao.imprimirRecibo();
		
		// Teste de Item de Leilão sem Lances
		leilao.iniciar();
		leilao.finalizar();
		leilao.imprimirRecibo();
		
		// Teste fim do Leilão
		leilao.iniciar();
	}

}
