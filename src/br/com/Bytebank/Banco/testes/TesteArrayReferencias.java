package br.com.Bytebank.Banco.testes;

import br.com.Bytebank.Banco.modelo.Cliente;
import br.com.Bytebank.Banco.modelo.Conta;
import br.com.Bytebank.Banco.modelo.ContaCorrente;
import br.com.Bytebank.Banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5]; // representa array 	// conforme aqui
		ContaCorrente cc1 = new ContaCorrente(22, 11); // cria objeto
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // array guarda referencias do tipo conta
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
