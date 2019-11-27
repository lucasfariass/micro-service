package com.spring.serasaclient.models;

public class Consumidor {
	
	private String cpf;
	private boolean nomeLimpo;
	
	public Consumidor(String cpf, boolean nomeLimpo) {
		this.cpf = cpf;
		this.nomeLimpo = nomeLimpo;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean isNomeLimpo() {
		return nomeLimpo;
	}
	
	public void setNomeLimpo(boolean nomeLimpo) {
		this.nomeLimpo = nomeLimpo;
	}
	
}
