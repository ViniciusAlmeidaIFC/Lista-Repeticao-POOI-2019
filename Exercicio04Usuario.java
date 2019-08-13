package com;

import java.util.Scanner;

public class Exercicio4Usuario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char opcao = 0;
		do {
			float pesA = 0;
			float pesB = 0;
			float taxaA = 0;
			float taxaB = 0;
			int qtdAnos = 0;
			do {
				System.out.print("Informe a quantidade de pessoas do pa�s A: ");
				pesA = entrada.nextFloat();
			} while (pesA < 0);
			do {
				System.out.print("Informe a quantidade de pessoas do pa�s B: ");
				pesB = entrada.nextFloat();
			} while (pesB < 0 || pesB < pesA);
			do {
				System.out.print("Informe a taxa de crescimento (%) do pa�s A: ");
				taxaA = entrada.nextFloat();
			} while (taxaA < 0);
			do {
				System.out.print("Informe a taxa de crescimento (%) do pa�s B: ");
				taxaB = entrada.nextFloat();
			} while (taxaB < 0 || taxaB >= taxaA);

			taxaA = 1 +  (taxaA / 100);
			taxaB = 1 + (taxaB / 100);
			do {
				pesA = pesA *  taxaA;
				pesB = pesB *  taxaB;
				qtdAnos++;
			} while (pesA <= pesB);

			System.out.println("A quantidade necess�ria � " + qtdAnos + " anos");
			do {
				System.out.print("\n Deseja repetir? (s - Sim | n - N�o): ");
				opcao = entrada.next().charAt(0);
			} while (opcao != 's' && opcao != 'n');
		} while (opcao == 's');
		
		entrada.close();

	}

}
