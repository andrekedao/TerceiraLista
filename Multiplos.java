package br.com.reges.terceiralista;
/**
 * Classe que modela o exercício 03 da terceira lista.
 * Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: “Múltiplo de 10”.
 * @author Andre Candioto
 *
 */


public class Multiplos {
	
	public static void main(String args[]) {
	
	int i = 0;
	
	do {		
		i = i +1;
		System.out.println("Contador: " + i);
		if(i%10==0)
		System.out.println("O Número " + i + " é Múltiplo de 10");	
	} while (i < 100);
	
	}
		
}


