package br.com.Bytebank.Banco.testes;

public class TesteString {

	public static void main(String[] args) {

		int a = 3;
		String nome =  "Alura"; // object literal
		//String outro = new String("Alura"); // má prática
		
		String outra = nome.replace("A", "a");
		
		//nome.toLowerCase();
		System.out.println(nome);
		System.out.println(outra);
		

	}

}
