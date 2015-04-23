package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 16 da terceira lista. Fa�a um algoritmo para ler um n�mero inteiro positivo
*e informar se este n�mero � primo ou n�o
* @author Andre Candioto
*/

import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0, 
		quantDivisoes = 0;
		
		System.out.println("Entre com o n�mero desejado:");
		num = Integer.parseInt(scan.nextLine());
		
		for (int i = num; i > 0; i--) {
						if (num % i == 0)
							quantDivisoes++;
					}
		if (quantDivisoes <= 2)
						System.out.println(String.format("O n�mero [%d] � primo.", num));
					else
						System.out.println(String.format("O n�mero [%d] N�O � primo.", num));
	}
}
