package br.com.reges.terceiralista;

import java.util.Scanner;

/**
 * Classe que modela o Exercicio 01 da Terceira Lista. Faça um algoritmo que determine o maior 
 * entre N números. A condição de parada é a entrada de um valor 0, ou seja, 
 * o algoritmo deve ficar calculando o maior até que a entrada seja igual a 0. 
 * @author Andre Candioto
 *
 */
public class MaiorNumero {
	
	
	public static void main(String[]arg){
		@SuppressWarnings("resource")
		  Scanner teclado = new Scanner(System.in);
		int Num1;
		int Maior = 0;	
	
		while (true){
		
			System.out.println("Digite um numero");
			Num1 = Integer.parseInt(teclado.nextLine());
		
			if(Num1 == 0){
		
			System.out.println("Finaliza Programa: Número Digitado Representa o Exit ");
		
			break;
			
			}
			
			if(Num1 > Maior){
				Maior = Num1;
				
			}
			
			System.out.println("Maior eh " + Maior + " e o Menor eh 0 ");
							
		}
	}
}




