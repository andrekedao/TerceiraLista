package br.com.reges.terceiralista;
/**
 * Classe que modela o Exercicio 02 da Terceira Lista. Faça um algoritmo para escrever os 
 * números pares entre 0 e 500.
 * @author Andre Candioto
 *
 */

public class NumerosPares {
		
		public static void main(String args[]) {
	
		int i = 0;
		
		while (i%2==0) {
					
			i = i +2;
			if(i==500)
				break;
            System.out.println("Numeros Pares de 0 a 500: " +i);
            	
			
    	}
	}
}
