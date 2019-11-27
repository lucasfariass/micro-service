package com.spring.bancoclient.models;

public class Conta {
	
	private int agencia;
	private int numero;
	private String cpfTitular;
	
	public Conta(int agencia, int numero, String cpfTitular) {
		this.agencia = agencia;
		this.numero = numero;
		this.cpfTitular = cpfTitular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCpfTitular() {
		return cpfTitular;
	}
	
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	
}
