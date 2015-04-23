package br.com.reges.terceiralista;
/**
*Classe que modela o exercicio 14 da terceira lista. Fa�a algoritmo para escrever a s�rie de 
*Fibonacci = (0,1,1,2,3,5,8,13,21,34,�) enquanto o termo a ser impresso for menor que 5000. 
*A sequ�ncia Fibonacci � feita recursivamente conforme a regra: come�a-se a s�rie com um 
*n�mero N1=0 e N2=1, a seguir, obt�m-se o pr�ximo n�mero de Fibonacci 
*somando-se os dois n�meros anteriores e, assim, sucessivamente.
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

