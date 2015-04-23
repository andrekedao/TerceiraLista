package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 15 da terceira lista. Fa�a um algoritmo para ler um n�mero 
*inteiro positivo e escrever o seu fatorial. Para determinar o fatorial de um n�mero, 
*come�amos multiplicando o n�mero n e decrescendo at� 1.
* @author Andre Candioto
*/

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x=69; 
		int f = x;

		System.out.println("Entre com o n�mero desejado:");
					
		while (x > 1){  
            f = f *(x-1); 
            x--; 
            System.out.println("O fatorial do n�mero [%d] � [%d]." + f);
		}
	}
}

