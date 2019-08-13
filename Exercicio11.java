package com;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contPar = 0;
		int contImpar = 0;
		System.out.println("Informe 10 números!");
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o "+ (i+1)+ "º número: ");
			int num = entrada.nextInt();
			if (num % 2 == 0)
				contPar++;
			else 
				contImpar++;
		}
		System.out.println("Quantidade de números pares: "+contPar);
		System.out.println("Quantidade de números ímpares: "+contImpar);
		entrada.close();

	}

}
