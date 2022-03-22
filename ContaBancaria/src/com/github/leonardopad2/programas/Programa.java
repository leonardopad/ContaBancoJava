package com.github.leonardopad2.programas;

import com.github.leonardopad2.classes.*;

public class Programa {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancariaPF("Claudio Fonseca", 1000.00, "123456", "PF");
		ContaBancaria conta2 = new ContaBancariaPJ("Auto-Peças Jacaré", 11000.00, "12345678", "PJ");
		ContaBancaria conta3 = new ContaBancariaPR("Severino Fagundes", 12000.00, "1234567", "PR", "Média");
	
		conta1.depositar(100.0);
		conta1.detalhes();
		conta1.depositar(100.0);
		conta1.detalhes();
		conta1.depositar(100.0);
		conta1.detalhes();
		
		conta1.sacar(100.0);
		conta1.detalhes();
		conta1.sacar(100.0);
		conta1.detalhes();
		conta1.sacar(10000.0);
		conta1.detalhes();
		

		
		conta2.depositar(100.0);
		conta2.detalhes();
		conta2.depositar(100.0);
		conta2.detalhes();
		conta2.depositar(100.0);
		conta2.detalhes();
		
		conta2.sacar(100.0);
		conta2.detalhes();
		conta2.sacar(100.0);
		conta2.detalhes();
		conta2.sacar(1000.0);
		conta2.detalhes();
		
		conta3.depositar(100.0);
		conta3.detalhes();
		conta3.depositar(100.0);
		conta3.detalhes();
		conta3.depositar(100.0);
		conta3.detalhes();
		
		conta3.sacar(100.0);
		conta3.detalhes();
		conta3.sacar(100.0);
		conta3.detalhes();
		conta3.sacar(100.0);
		conta3.detalhes();
	
	}
	
	
	
}
