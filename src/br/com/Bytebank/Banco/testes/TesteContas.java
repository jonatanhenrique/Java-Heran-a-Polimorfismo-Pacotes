package br.com.Bytebank.Banco.testes;



import br.com.Bytebank.Banco.especial.ContaEspecial;
import br.com.Bytebank.Banco.modelo.ContaCorrente;
import br.com.Bytebank.Banco.modelo.ContaPoupanca;
import br.com.Bytebank.Banco.modelo.SaldoInsuficienteException;


public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
//		ContaEspecial ce = new ContaEspecial(123, 456789)
//				super.saldo +=

		ContaCorrente cc = new ContaCorrente(111, 101);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 202);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
