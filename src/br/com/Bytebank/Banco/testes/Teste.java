package br.com.Bytebank.Banco.testes;

import br.com.Bytebank.Banco.modelo.Conta;
import br.com.Bytebank.Banco.modelo.ContaCorrente;
import br.com.Bytebank.Banco.modelo.GuardadorDeContas;

public class Teste {
	
	public static void main(String[] args) {
	
	GuardadorDeContas guardador = new GuardadorDeContas(); // construtor
	
	Conta cc = new ContaCorrente(22, 11);
	guardador.adiciona(cc);
	
	Conta cc2 = new ContaCorrente(22, 22);
	guardador.adiciona(cc2);
	
	int tamanho = guardador.getQuantidadeDeElementos();
	System.out.println(tamanho);
	
	Conta ref = (Conta) guardador.getReferencia(1);
	System.out.println(ref.getNumero());
	
	
	}

}
