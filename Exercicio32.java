package com;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtd = 5;
		int maior = 0;
		int menor = 0;
		int maiorCod = 0;
		int menorCod = 0;
		int somaVei = 0;
		int somaAci = 0;
		int contAci = 0;

		for (int i = 0; i < qtd; i++) {
			System.out.println((i + 1) + "ª cidade: ");
			System.out.print("Informe o código: ");
			int cod = entrada.nextInt();
			System.out.print("Informe o número de veículos de passeio (em 1999): ");
			int numVei = entrada.nextInt();
			System.out.print("Informe o número de acidentes de trânsito com vítimas (em 1999): ");
			int numAci = entrada.nextInt();

			if (i == 1) {
				maior = numAci;
				menor = numAci;
				maiorCod = cod;
				menorCod = cod;
			} else {
				if (numAci > maior) {
					maior = numAci;
					maiorCod = cod;
				}
				if (numAci < menor) {
					menor = numAci;
					menorCod = cod;
				}
			}

			somaVei = somaVei + numVei;
			if (numVei < 2000) {
				somaAci = somaAci + numAci;
				contAci++;
			}
		}

		int mediaVei = somaVei / qtd;
		int mediaAci = somaAci / contAci;
		
		System.out.println("Maior índice de acidentes: "+maior);
		System.out.println("Cidade: "+maiorCod);
		System.out.println("Menor índice de acidentes: "+menor);
		System.out.println("Cidade: "+menorCod);
		System.out.println("A média de veículos nas cinco cidades juntas é "+mediaVei);
		System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é "+mediaAci);
		entrada.close();

	}

}
