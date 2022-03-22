package com.github.leonardopad2.classes;

import com.github.leonardopad2.interfaces.detalhesConta;

public class ContaBancaria implements detalhesConta{
	private String nomeUsuario;
	private Double saldo;
	private String numeroConta;
	private String tipoConta;
	
	//construtor
	public ContaBancaria(String nomeUsuario, Double saldo, String numeroConta, String tipoConta) {
		this.nomeUsuario = nomeUsuario;
		this.setSaldo(saldo);
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
	}
	// getters
	public Double getSaldo() {
		return this.saldo = saldo;
	}
	
	public String getNomeUsuario() {
		return this.nomeUsuario = nomeUsuario;
	}
	public String getNumeroConta() {
		return this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return this.tipoConta;
	}
	// setters
	public void setNome(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
		
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
		
	}
	
	//methods
	public double depositar (Double valor) {
		return this.saldo = this.saldo + valor;
	}
	
	public void sacar (Double valor) {
		 this.saldo = this.saldo - valor;
	}
	@Override
	public void detalhes() {
		System.out.println("Conta " + this.getNumeroConta());
		System.out.println("Usuário " + this.getNomeUsuario());
		System.out.println("Tipo da conta: " + this.getTipoConta());
		System.out.println("Saldo " + this.getSaldo());
		
	}


}
