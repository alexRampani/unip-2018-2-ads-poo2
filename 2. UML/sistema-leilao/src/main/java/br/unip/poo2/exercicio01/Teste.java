package br.unip.poo2.exercicio01;

import java.util.ArrayList;
import java.util.List;

import br.unip.poo2.exercicio01.model.ItemLeilao;
import br.unip.poo2.exercicio01.model.Leilao;
import br.unip.poo2.exercicio01.model.Leiloeiro;
import br.unip.poo2.exercicio01.model.Participante;

public class Teste {

	public static void main(String[] args) {
		
		// Cria o Leiloeiro para o Leilão
		Leiloeiro leiloeiro = new Leiloeiro();
		leiloeiro.setNome("Luiz");
		
		// Cria os Itens de Leilão
		ItemLeilao item1 = new ItemLeilao();
		item1.setNome("Gol");
		item1.setValorMinimo(4000);
		
		ItemLeilao item2 = new ItemLeilao();
		item2.setNome("Ford Ka");
		item2.setValorMinimo(5000);
		
		// Cria uma lista para armazenar os Itens de Leilão
		List<ItemLeilao> itens = new ArrayList<ItemLeilao>();
		itens.add(item1);
		itens.add(item2);
		
		// Cria um Leilão, com Leiloeiro e Itens de Leilão
		Leilao leilao = new Leilao(leiloeiro, itens);
		
		// Inicia o Leilão (primeiro item "em leilão")
		leiloeiro.iniciar(leilao);
		
		// Cria os Participantes para os Lances
		Participante rafael = new Participante();
		rafael.setNome("Rafael");
		rafael.setCpf("968.652.720-61");
		
		Participante jorge = new Participante();
		jorge.setNome("Jorge");
		jorge.setCpf("086.614.370-08");
		
		// Registra os Lances (criados no método registrarLance do Participante)
		rafael.registrarLance(leilao, 4000);
		jorge.registrarLance(leilao, 4050);
		rafael.registrarLance(leilao, 4100);
		jorge.registrarLance(leilao, 4150);
		
		// Finaliza o Item de Leilão
		leiloeiro.finalizar(leilao);
		
		// Imprime o recibo para o Vencedor
		leiloeiro.imprimirRecibo(leilao);
		
		// Teste de Item de Leilão sem Lances
		leiloeiro.iniciar(leilao);
		leiloeiro.finalizar(leilao);
		leiloeiro.imprimirRecibo(leilao);

		// Teste fim do Leilão
		leiloeiro.iniciar(leilao);
	}
}






