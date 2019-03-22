package br.com.Bytebank.Banco.testes;

import br.com.Bytebank.Banco.modelo.Conta;
import br.com.Bytebank.Banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		
		System.out.println(conta.getSaldo());
	}

}
