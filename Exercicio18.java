package com;

import java.util.Scanner;

public class Exercicio18 {

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
			System.out.println(num+" é um número primo ");
		else {
			System.out.println(num+" não é um número primo ");
			for (int k = 1; k <= num; k++) {
				if (num % k == 0)
					System.out.println("Divisível por: "+ k);
			}
		}
		entrada.close();

	}

}
