package com;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num = 0;
		int cont25 = 0;
		int cont50 = 0;
		int cont75 = 0;
		int cont100 = 0;
		do {
			System.out.print("Informe um número: ");
			num = entrada.nextFloat();
			if (num >= 0)
				if (num <= 25) {
					cont25++;
				} else {
					if (num <= 50) {
						cont50++;
					} else {
						if (num <= 75) {
							cont75++;
						} else {
							if (num <= 100)
								cont100++;
						}
					}
				}
		} while (num >= 0);

		System.out.println("| 0-25 | = " + cont25);
		System.out.println("| 26-50| = " + cont50);
		System.out.println("| 51-75| = " + cont75);
		System.out.println("|65-100| = " + cont100);
		
		entrada.close();

	}

}
