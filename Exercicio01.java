package com;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num;
		do {
			System.out.print("Informe um número de 0 a 10: ");
			num = entrada.nextDouble();
		}while (num < 0 || num>10);
		entrada.close();


	}

}
