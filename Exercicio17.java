package com;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int num = entrada.nextInt();
		
		boolean logico = false;
		int i = 2;
		do {
			if (num != i && num % i == 0 || num == 1) {
				logico = true;
			}
			i++;
		} while (logico == false && i <= num);

		if (logico == false)
			System.out.println("É um número primo ");
		else {
			System.out.println("Não é um número primo ");
		}
		entrada.close();

	}

}
