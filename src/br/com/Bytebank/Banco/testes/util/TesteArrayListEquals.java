package br.com.Bytebank.Banco.testes.util;

import java.util.ArrayList;

import br.com.Bytebank.Banco.modelo.Conta;
import br.com.Bytebank.Banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista =new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc);
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc2);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Conta conta : lista) {
		System.out.println(conta);	
		}
	}

}
