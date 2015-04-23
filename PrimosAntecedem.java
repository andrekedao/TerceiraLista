package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 17 da terceira lista. Fa�a um algoritmo para ler um valor inteiro N 
*e escrever os n�meros primos que o antecedem.
* @author Andre Candioto
*/

import java.util.Scanner;

public class PrimosAntecedem {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num ;
		System.out.println("Entre com o n�mero desejado:");
		num = Integer.parseInt(scan.nextLine());

				
		System.out.println("Rela��o de N�meros Primos Anteriores � " + num);
				for (int i = num; i > 0; i--) {
		
					int quantDivisoes = 0;
		
					for (int j = i; j > 0; j--) {
						if (i % j == 0)
							quantDivisoes++;
					}
		
					if (i != num && quantDivisoes <= 2)
						System.out.println(String.format("N�mero: %d", i));
				}
	}
}
