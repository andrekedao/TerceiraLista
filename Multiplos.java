package br.com.reges.terceiralista;
/**
 * Classe que modela o exerc�cio 03 da terceira lista.
 * Fa�a um algoritmo que conte de 1 a 100 e a cada m�ltiplo de 10 emita uma mensagem: �M�ltiplo de 10�.
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
		System.out.println("O N�mero " + i + " � M�ltiplo de 10");	
	} while (i < 100);
	
	}
		
}


