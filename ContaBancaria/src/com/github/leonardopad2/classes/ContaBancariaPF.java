package com.github.leonardopad2.classes;

public class ContaBancariaPF extends ContaBancaria {

	private Integer operacoes = 0;
	public ContaBancariaPF(String nomeUsuario, Double saldo, String numeroConta, String tipoConta) {
		super(nomeUsuario, saldo, numeroConta, tipoConta);
	}
	
	@Override
	public double depositar(Double valor) {
		double taxa = valor * 0.01;
		valor -= taxa;
		return super.depositar(valor);
		
	}
	
	@Override
	public void sacar(Double valor) {
			if (valor > this.getSaldo()) {
				System.out.println("Saldo insuficiente!");
				return;
			}
			if (this.operacoes > 3) {
				double taxa = valor * 0.015;
				valor += taxa;
				super.sacar(valor);
			}
			super.sacar(valor);
			this.operacoes++;
	}
	
}