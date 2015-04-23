package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 18 da terceira lista. ) Fa�a um algoritmo para ler um n�mero inteiro 
*e gerar outro n�mero inteiro formado pelos d�gitos invertidos do n�mero lido.
*Ex: n�mero lido = 12345 e n�mero gerado = 54321
* @author Andre Candioto
*/

import java.util.Scanner;

public class NumerosInvertidos {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	
			int num;
	
			System.out.println("Entre com o n�mero desejado:");
			num = Integer.parseInt(scan.nextLine());	
	
			while (num > 0) {
				System.out.print(num % 10);
				num /= 10;
			}
	
			scan.close();
		}
}
