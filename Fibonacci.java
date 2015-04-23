package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 14 da terceira lista. Faça algoritmo para escrever a série de 
*Fibonacci = (0,1,1,2,3,5,8,13,21,34,…) enquanto o termo a ser impresso for menor que 5000. 
*A sequência Fibonacci é feita recursivamente conforme a regra: começa-se a série com um 
*número N1=0 e N2=1, a seguir, obtém-se o próximo número de Fibonacci 
*somando-se os dois números anteriores e, assim, sucessivamente.
* @author Andre Candioto
*/
public class Fibonacci {
	
	public static void main(String[] args) {
			int n1 = 0;
			int n2 = 1;
			int fibonacci;
			
			System.out.println("Fibonacci: " + n1);
			System.out.println("Fibonacci: " + n2);
			
			while (true) {
				fibonacci = n1 + n2;
				
				if (fibonacci > 5000) break;
							
				n1=n2;
				n2=fibonacci;
							
				System.out.println("Fibonacci: " + fibonacci);
			}
		}
	}

