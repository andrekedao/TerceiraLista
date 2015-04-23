package br.com.reges.terceiralista;

import java.util.Scanner;
/**
*Classe que modela o exercicio 06 da terceira lista. Faça um algoritmo para ler um valor N e 
*em seguida ler N números inteiros e escrever o maior número lido.
* @author Andre Candioto
*/

public class MaiorNumeroLido {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		  Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a Qtd de numeros lidos: ");
		int num = Integer.parseInt(teclado.nextLine());
		int maior = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("Informe o n°: ");
		int n = Integer.parseInt(teclado.nextLine());
		if (n > maior) {
		maior = n;
		}
		}
		System.out.println("o valor maior é: " + maior);
		}
}


