package br.com.reges.terceiralista;

import java.util.Scanner;
/**
*Classe que modela o exercicio 05 da terceira lista. Fa�a um algoritmo para ler 10 n�meros inteiros 
*e escrever a soma e a m�dia dos n�meros lidos.
* @author Andre Candioto
*/

public class SomaMedia  {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			  Scanner teclado = new Scanner(System.in);
		int soma = 0;
		int media;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o n�mero: ");
			int num = Integer.parseInt(teclado.nextLine());
			soma = soma + num;
			media = soma/(i+1);
			System.out.println("Total: " + soma);
			System.out.println("M�dia: " + media);
		}
	}
}