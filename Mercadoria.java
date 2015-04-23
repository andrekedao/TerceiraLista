package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 19 da terceira lista. Faça um algoritmo para ler o código, 
*descrição, estoque mínimo e estoque das mercadorias de um supermercado. 
*Escreva o código e a descrição das mercadorias como estoque abaixo do mínimo. 
*Repita o processo enquanto o código informado for maior que 0. 
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
	
			System.out.println("\nInclusão de Mercadoria\n======================");
				Mercadoria mercadoria = new Mercadoria();
	
				System.out.println("Entre com o código da mercadoria:");
				codigo = Integer.parseInt(scan.nextLine());
							
				System.out.println("Entre com a descrição da mercadoria:");
				descricao = (scan.nextLine());
	
				System.out.println("Entre com o estoque MÍNIMO da mercadoria:");
				estoqueMinimo = Integer.parseInt(scan.nextLine());
									
				System.out.println("Entre com o estoque ATUAL da mercadoria:");
				estoqueAtual = Integer.parseInt(scan.nextLine());
				
				do {
					System.out.println("Estoque abaixo do Minimo: " + estoqueAtual );
				} while (estoqueAtual != 0);
 }
}
