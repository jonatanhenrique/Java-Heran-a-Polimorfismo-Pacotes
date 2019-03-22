package br.com.Bytebank.Banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Jonatan
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>{
	protected double saldo;
	private int agencia;
	private int numero; // atributos
	private Cliente titular; // nome da classe
	private static int total; // static é da  classe e nao do objeto
	
/**
 * Construtor para inicialiar o objeto Conta a partir da agencia e numero.
 * @param agencia
 * @param numero
 */
	
	public Conta(int agencia, int numero) { // construtor específico
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo. 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException{ 
		if(this.saldo < valor) { // problema
			throw new SaldoInsuficienteException("O Saldo é: " + this.saldo + " , Valor: " + valor);
	}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); {
		destino.deposita(valor);
		}
	}
		
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero (int numero){
		if(numero<=0) {
			System.out.println("não pode valor menor que 0.");
			return;
		}
		this.numero = numero; // esq atributo direita variavel que recebeu
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia<=0) {
			System.out.println("não pode valor menor que 0.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}		
	
public Cliente getTitular() {
	return titular;
}	

public static int getTotal() {
	return Conta.total;
}
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) { // nao precisa do get dentro de classe
		return Double.compare(this.saldo, outra.saldo);
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Número " + this.getNumero() + ", " + "Agência: " + this.getAgencia() + ", " 
			+ "Nome: " + this.getTitular().getNome() + ", " + "Saldo R$ " + this.getSaldo();
	
}

}
