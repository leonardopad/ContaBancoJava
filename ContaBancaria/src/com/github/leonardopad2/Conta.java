package com.github.leonardopad2;


/**
 * @author leonardo Padilha Fontana
 */
public class Conta {

		public String nomeUsuario;
		public Double saldo;
		public String numeroConta;
		public String tipoConta;
		public Integer operacoes;
		
		public Conta(String nomeUsuario, Double saldo, String numeroConta, String tipoConta, Integer operacoes ) {
			this.nomeUsuario = nomeUsuario;
			this.saldo = saldo;
			this.numeroConta = numeroConta;
			this.tipoConta = tipoConta;
			this.operacoes = operacoes;
		}
		
		public Double depositar(Double valor) {
			double ValorADepositar = valor;
			if(tipoConta.equals("PF")) {
				ValorADepositar -= (valor * 0.02);
			} else {
				ValorADepositar  -= valor * 0.01;
			}
			saldo = saldo + ValorADepositar;
			imprimirSaldo();
			return ValorADepositar;
		}

		public double sacar (Double valor) {
			Double ValorASacar = valor;
			if(ValorASacar > saldo && tipoConta == "PF"){
				valor = 0.0;
				System.out.println("Não é possível sacar valores acima do que possui");
			} else {
				saldo = saldo - valor;
				if (operacoes > 3) {
					if (tipoConta == "PF") {
						ValorASacar -= ValorASacar * 0.02;
					}else {
						ValorASacar -= ValorASacar * 0.01;
					}
				}
			}imprimirSaldo();
			
			operacoes++;
			return ValorASacar;
		}
	
		
		public Void imprimirSaldo() {
				System.out.println(nomeUsuario + " possui " + saldo + " na conta");
				return null;
		}
	
		
		
	}	
