package br.com.Bytebank.Banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
	
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}

}
