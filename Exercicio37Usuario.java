package com;

import java.util.Scanner;

public class Exercicio37Usuario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtd = 10;
		char vetor[] = new char[qtd];

		System.out.println("Professor, informe o gabarito: ");
		for(int i = 0; i < qtd; i++) {
			System.out.print("Quest�o "+(i+1)+": ");
			vetor[i] = entrada.next().charAt(0);
		}

		char opcao = 0;
		char resposta = 0;
		int pontos = 0;
		int qtdAlunos = 0;
		int maior = 0;
		int menor = 0;
		int somaNotas = 0;
		do {
			qtdAlunos++;
			pontos = 0;
			for (int i = 0; i < qtd; i++) {
				System.out.print((i + 1) + "� pergunta, resposta: ");
				resposta = entrada.next().charAt(0);

				if (resposta == vetor[i])
					pontos++;
			}
			if(qtdAlunos == 1) {
				maior = pontos;
				menor = pontos;
			}else {
				if(pontos > maior)
					maior = pontos;
				if(pontos < menor)
					menor = pontos;
			}
			somaNotas = somaNotas + pontos;

			do {
				System.out.println("Outro aluno utilizar� o sistema? (s - Sim | n - N�o)");
				opcao = entrada.next().charAt(0);
			} while (opcao != 's' && opcao != 'n');
		} while (opcao == 's');

		System.out.println("A maior nota � "+maior);
		System.out.println("A menor nota � "+menor);
		System.out.println("O total de alunos que utilizaram o sistema � "+qtdAlunos);
		float media = somaNotas / qtdAlunos;
		System.out.println("A m�dia de notas da turma � "+media);
		
		entrada.close();


	}

}
