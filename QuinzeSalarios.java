package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 08 da terceira lista. Faça um algoritmo para ler o valor de 15 salários, 
*e escreva quais os três maiores valores dos salários lidos.
* @author Andre Candioto
*/

import java.util.Scanner;

public class QuinzeSalarios {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		  Scanner teclado = new Scanner(System.in);
		 double[] num = new double[15];
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o salario do " + (i + 1)	+ "º funcionário: ");
			num[i] = Integer.parseInt(teclado.nextLine());
		}
			
			System.out.println(String.format("Os três maiores salários são: R$ %.2f, R$ %.2f e R$ %.2f.", 
					num[14], num[13], num[12]));
		}
	}

		