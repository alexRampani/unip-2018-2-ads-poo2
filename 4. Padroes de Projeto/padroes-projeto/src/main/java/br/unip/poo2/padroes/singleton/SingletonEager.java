package br.unip.poo2.padroes.singleton;

public class SingletonEager {
	
	private final static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
