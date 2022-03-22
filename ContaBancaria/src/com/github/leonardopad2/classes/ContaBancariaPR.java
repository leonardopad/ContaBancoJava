package com.github.leonardopad2.classes;

public class ContaBancariaPR extends ContaBancaria {


	public ContaBancariaPR(String nomeUsuario, Double saldo, String numeroConta, String tipoConta, String porte) {
		super(nomeUsuario, saldo, numeroConta, tipoConta);
	}
	private int operacoes;
	
	@Override
	public void sacar(Double valor) {	
			if (this.operacoes > 3) {
				double taxa = valor * 0.01;
				valor += taxa;
				super.sacar(valor);
				return;
			}
			super.sacar(valor);
			this.operacoes++;
	}

	@Override
	public double depositar(Double valor) {
		if(valor <= 1000) {
			double taxa = valor * 0.08;
			valor -= taxa;
			return super.depositar(valor);
		}
		return super.depositar(valor);
	}

}
