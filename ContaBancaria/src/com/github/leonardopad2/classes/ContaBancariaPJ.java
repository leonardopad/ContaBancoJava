package com.github.leonardopad2.classes;

public class ContaBancariaPJ extends ContaBancaria {

	public ContaBancariaPJ(String nomeUsuario, Double saldo, String numeroConta, String tipoConta) {
		super(nomeUsuario, saldo, numeroConta, tipoConta);
	}
	
	@Override
	public void sacar(Double valor) {
		Double taxa = valor *0.02;
		valor += taxa;
		super.sacar(valor);
	}
	
	@Override
	public double depositar(Double valor) {
		Double taxa = valor *0.02;
		valor -= taxa;
		return super.depositar(valor);
	}

	
	
	
}
