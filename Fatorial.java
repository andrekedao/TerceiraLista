package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 15 da terceira lista. Faça um algoritmo para ler um número 
*inteiro positivo e escrever o seu fatorial. Para determinar o fatorial de um número, 
*começamos multiplicando o número n e decrescendo até 1.
* @author Andre Candioto
*/

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x=69; 
		int f = x;

		System.out.println("Entre com o número desejado:");
					
		while (x > 1){  
            f = f *(x-1); 
            x--; 
            System.out.println("O fatorial do número [%d] é [%d]." + f);
		}
	}
}

