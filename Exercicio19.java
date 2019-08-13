package com;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
			System.out.print("Informe um número: ");
			num = entrada.nextInt();
			
		int vetor[] = new int[num];

		boolean logico;
		int k = 0;
		int cont = 0;
		for (int i = 1; i <= num; i++) {
			logico = false;
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0 || i == 1) {
					logico = true;
					cont++;
				}
			}
			if(logico == false) {
				vetor[k] = i;
				k++;
			}
		}

		System.out.print("Os números primos até o número "+num+" é: ");
		for (int m = 0; m < k; m++) {
			if(m != 0) System.out.print(" | ");
			System.out.print(vetor[m]);
		}
		System.out.println("\nO número de divisões necessárias foi "+cont);
		entrada.close();

	}

}
