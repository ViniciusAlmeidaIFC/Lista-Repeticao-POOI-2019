package com;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Série de Fibonacci!");
		System.out.print("Informe quantos termos: ");
		int n = entrada.nextInt();

		int num1 = 1, num2 = 0;

		System.out.println(num2);
		System.out.println(num1);

		for (int i = 0; i < n; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.println(num1);
		}
		entrada.close();

	}

}
