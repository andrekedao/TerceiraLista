package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 18 da terceira lista. ) Faça um algoritmo para ler um número inteiro 
*e gerar outro número inteiro formado pelos dígitos invertidos do número lido.
*Ex: número lido = 12345 e número gerado = 54321
* @author Andre Candioto
*/

import java.util.Scanner;

public class NumerosInvertidos {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	
			int num;
	
			System.out.println("Entre com o número desejado:");
			num = Integer.parseInt(scan.nextLine());	
	
			while (num > 0) {
				System.out.print(num % 10);
				num /= 10;
			}
	
			scan.close();
		}
}
