package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 19 da terceira lista. Fa�a um algoritmo para ler o c�digo, 
*descri��o, estoque m�nimo e estoque das mercadorias de um supermercado. 
*Escreva o c�digo e a descri��o das mercadorias como estoque abaixo do m�nimo. 
*Repita o processo enquanto o c�digo informado for maior que 0. 
* @author Andre Candioto
*/

import java.util.Scanner;

public class Mercadoria {
	
 public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	
			int codigo;
			String descricao = "";
			int estoqueMinimo;
			int estoqueAtual;
	
			System.out.println("\nInclus�o de Mercadoria\n======================");
				Mercadoria mercadoria = new Mercadoria();
	
				System.out.println("Entre com o c�digo da mercadoria:");
				codigo = Integer.parseInt(scan.nextLine());
							
				System.out.println("Entre com a descri��o da mercadoria:");
				descricao = (scan.nextLine());
	
				System.out.println("Entre com o estoque M�NIMO da mercadoria:");
				estoqueMinimo = Integer.parseInt(scan.nextLine());
									
				System.out.println("Entre com o estoque ATUAL da mercadoria:");
				estoqueAtual = Integer.parseInt(scan.nextLine());
				
				do {
					System.out.println("Estoque abaixo do Minimo: " + estoqueAtual );
				} while (estoqueAtual != 0);
 }
}
