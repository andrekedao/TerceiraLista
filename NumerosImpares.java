package br.com.reges.terceiralista;

import java.util.Scanner;

/**
*Classe que modela o exercicio 04 da terceira lista. Faça um algoritmo para ler dois números inteiros 
*representando um intervalo e escrever em ordem crescente todos os números ímpares do intervalo.
* @author Andre Candioto
*/

	public class NumerosImpares{
	
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			  Scanner teclado = new Scanner(System.in);
			int num1 = 0;
			int num2 = 0;
			
			System.out.println("Informe o 1° valor: ");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o 2° valor: ");
			num2 =Integer.parseInt(teclado.nextLine());
			
			while(num1 < num2){
				num1++;
				if (num1 % 2 != 0) {
					System.out.println(num1);
				}
			}
			while(num2 < num1){
				num2++;
				if (num2 % 2 != 0) {
					System.out.println(num2);
				}
			}	
		}
	}
