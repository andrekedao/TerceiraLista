package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 07 da terceira lista. Fa�a um algoritmo para ler 20 n�meros inteiros, 
*em seguida escrever o menor valor lido e quantas vezes este ocorreu nos n�meros lidos.
*@author Andre Candioto 
*/

import java.util.Arrays;
import java.util.Scanner;

public class MenorNumeroLido {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int[] num = new int[20];
		
				
		for (int i = 0; i < 20; i++) {
			System.out.println("Informe o n�: " + (i + 1) + ":");
		num[i] = Integer.parseInt(scan.nextLine());
		
		Arrays.sort(num);
		int quant = 0;
		
		
		for (  int a : num) {
			if (a == num[0])
				quant ++;
			}
		
		System.out.println("O Menor n�mero digitado foi: " + num[0] + ", e ele foi digitado " + quant + " vezes.");
		}
	}
}


