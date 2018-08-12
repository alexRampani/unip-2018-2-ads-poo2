package br.unip.poo1.np1;

public class Teste {

	public static void main(String[] args) {
		Motor motor1 = new Motor();
		Motor motor2 = new Motor();
		
		Carro carro1 = new Carro(motor1);
		Carro carro2 = new Carro(motor2);
		
		carro1.ligar();
		carro2.ligar();
		
		carro1.acelerar();
		carro2.acelerar(50);
		
		double v1 = carro1.getVelocidadeAtual();
		double v2 = carro2.getVelocidadeAtual();
		
		System.out.println(v1);
		System.out.println(v2);
	}
}
