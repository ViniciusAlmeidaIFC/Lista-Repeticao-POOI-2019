package com;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de turmas: ");
		int qtd = entrada.nextInt();
		int qtdAlunos = 0;
		int soma = 0;
		for (int i = 0; i < qtd; i++) {
			do {
				System.out.print("Informe a quantidade de alunos da " + (i + 1) + "� turma: ");
				qtdAlunos = entrada.nextInt();
			} while (qtdAlunos < 0 || qtdAlunos > 40);
			soma = soma + qtdAlunos;
		}
		int media = soma / qtd;
		
		System.out.println("A m�dia de alunos por turma � "+media);
		entrada.close();

	}

}
