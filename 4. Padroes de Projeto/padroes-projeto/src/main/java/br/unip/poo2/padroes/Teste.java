package br.unip.poo2.padroes;

import br.unip.poo2.padroes.singleton.SingletonEager;
import br.unip.poo2.padroes.singleton.SingletonLazy;
import br.unip.poo2.padroes.strategy.Estrategia;
import br.unip.poo2.padroes.strategy.EstrategiaAgressiva;
import br.unip.poo2.padroes.strategy.EstrategiaDefensiva;
import br.unip.poo2.padroes.strategy.EstrategiaNormal;
import br.unip.poo2.padroes.strategy.Robo;
import br.unip.poo2.padroes.templatemethod.PacoteA;
import br.unip.poo2.padroes.templatemethod.PacoteB;
import br.unip.poo2.padroes.templatemethod.Viagem;

public class Teste {

	public static void main(String[] args) {
		testarSingletonPreguicoso();
		testarSingletonAncioso();
		
		testarTemplateMethod();
		
		testarStrategy();
	}

	private static void testarStrategy() {
		Estrategia normal = new EstrategiaNormal();
		Estrategia agressiva = new EstrategiaAgressiva();
		Estrategia defenssiva = new EstrategiaDefensiva();
		
		Robo robo = new Robo();
		robo.setEstrategia(normal);
		robo.mover();
		robo.mover();
		robo.setEstrategia(defenssiva);
		robo.mover();
		robo.setEstrategia(agressiva);
		robo.mover();
	}

	private static void testarTemplateMethod() {
		Viagem pacoteA = new PacoteA();
		Viagem pacoteB = new PacoteB();
		pacoteA.realizarViagem();
		pacoteB.realizarViagem();
	}

	private static void testarSingletonAncioso() {
		SingletonEager s1 = SingletonEager.getInstancia();
		SingletonEager s2 = SingletonEager.getInstancia();
		System.out.println(s1);
		System.out.println(s2);
	}

	private static void testarSingletonPreguicoso() {
		SingletonLazy s1 = SingletonLazy.getInstancia();
		SingletonLazy s2 = SingletonLazy.getInstancia();
		System.out.println(s1);
		System.out.println(s2);
	}

}
