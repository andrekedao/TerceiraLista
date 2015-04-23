package br.com.reges.terceiralista;
/**
 * Classe que modela os exercicios 09,10,11,12 e 13.Faça um algoritmo para ler o nome, 
 * sexo ("M"=Masculino e "F"=Feminino), 
 * três notas e o número de faltas dos alunos de uma turma e escrever:
 * A média e a situação final de cada aluno – Modele a classe turma com um array de alunos
 * A média das notas dos homens e a média das notas das mulheres – Modele a classe turma com um array de alunos
 * O percentual de homem e o percentual de mulheres reprovados – Modele a classe turma com um array de alunos
 * O percentual geral de reprovação da turma – Modele a classe turma com um array de alunos
 * @author Andre Candioto
 */

import java.util.Scanner;

public class NomeSexoNotasFaltasAlunos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = "";
		String sexo;
		double nota1;
		double nota2;
		double nota3;
		double media;
		double mediaM = 0;
		double mediaM2 = 0;
		double mediaF2 = 0;
		double mediaF = 0;
		double porcM = 0;
		double porcF = 0;
		double porcR = 0;
		int faltas;
		int contM = 0;
		int contF = 0;
		int contPorcM = 0;
		int contPorcF = 0;
		System.out.println("Digite o nome: ");
		nome = (teclado.nextLine());
		while (!nome.equalsIgnoreCase("fim")) {
		System.out.println("Digite o sexo: ");
		sexo = (teclado.nextLine());
		System.out.println("Digite 1ª Nota: ");
		nota1 = (Double.parseDouble(teclado.nextLine()));
		System.out.println("Digite 2ª Nota: ");
		nota2 = (Double.parseDouble(teclado.nextLine()));
		System.out.println("Digite 3ª Nota: ");
		nota3 = (Double.parseDouble(teclado.nextLine()));
		media = (nota1 + nota2 + nota3)/3;
		System.out.println("Quantidade de faltas: ");
		faltas = Integer.parseInt(teclado.nextLine());
		if ((media>=5) && (faltas<=27)){
		System.out.println(nome +", Sexo: " + sexo +", Média: " + media +
		", "+ faltas + " faltas" + ", Aprovado(a)");
		}else{
		System.out.println(nome +", Sexo: " + sexo +", Média: " + media +
		", "+ faltas + " faltas" + ", Reprovado(a)");
		}
		if (sexo == "M"|| sexo == "m"){
		contM = contM +1;
		mediaM = (mediaM + media);
		}
		if (sexo == "F"|| sexo == "f"){
		contF = contF +1;
		mediaF = (mediaF + media);
		}
		if ( (sexo == "M" || sexo == "m") && (media<5 || faltas>27)){
		contPorcM = contPorcM + 1;
		porcM = (contPorcM*100)/contM;
		}
		if ((sexo == "F" || sexo == "f") && (media<5 || faltas>27)){
		contPorcF = contPorcF + 1;
		porcF = (contPorcF*100)/contF;
		}
		if ((media<5) || (faltas>27)){
		porcR = ((contPorcM + contPorcF)*100)/(contM + contF);
		}
		mediaM2 = (mediaM/contM);
		mediaF2 = (mediaF/contF);
		System.out.println("Digite o nome: ");
		nome = (teclado.nextLine());
		}
		System.out.println("Média das notas dos homens: "+ mediaM2);
		System.out.println("Média das notas das mulheres: "+ mediaF2);
		System.out.println("Percentual de Homens Reprovados: " + porcM);
		System.out.println("Percentual de Mulheres Reprovados: " + porcF);
		System.out.println("Percentual Geral de Reprovação da Turma: " + porcR);
		}
}

