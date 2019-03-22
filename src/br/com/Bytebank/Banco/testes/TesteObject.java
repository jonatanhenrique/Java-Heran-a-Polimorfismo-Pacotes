package br.com.Bytebank.Banco.testes;

import br.com.Bytebank.Banco.modelo.Cliente;
import br.com.Bytebank.Banco.modelo.ContaCorrente;
import br.com.Bytebank.Banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 32123);
		ContaPoupanca cp = new ContaPoupanca(122, 212121);
		Cliente c = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		

		System.out.println();

	}

}
