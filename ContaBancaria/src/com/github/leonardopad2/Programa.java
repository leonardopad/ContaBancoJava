package com.github.leonardopad2;



public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta1 = new Conta("João da Silva", 799.99, "123456", "PF", 0);
//		conta1.sacar(100.0);
		for(int i = 0; i < 5; i++) {
			System.out.println("Sacou:" + (conta1.sacar(100.0))); 
		}
//		conta1.depositar(100.0);
		for(int i = 0; i < 5; i++) {
			System.out.println("Depositou " + (conta1.depositar(100.0)));
		}
	}

}