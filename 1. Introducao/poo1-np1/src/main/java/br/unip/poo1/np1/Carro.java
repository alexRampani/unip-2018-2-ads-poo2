package br.unip.poo1.np1;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private Motor motor;

	// Construtores:
	
	public Carro() {
		
	}
	
	public Carro(Motor motor) {
		this.motor = motor;
	}
	
	// Getters e Setters:
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	// Meus métodos:
	
	public void ligar() {
		System.out.println("Carro ligado e pronto para acelerar!");
	}
	
	public void acelerar(double quantidade) {
		velocidadeAtual += quantidade;
	}
	
	public void acelerar() {
		acelerar(10);
	}
}
