package com;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contPar = 0;
		int contImpar = 0;
		System.out.println("Informe 10 n�meros!");
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o "+ (i+1)+ "� n�mero: ");
			int num = entrada.nextInt();
			if (num % 2 == 0)
				contPar++;
			else 
				contImpar++;
		}
		System.out.println("Quantidade de n�meros pares: "+contPar);
		System.out.println("Quantidade de n�meros �mpares: "+contImpar);
		entrada.close();

	}

}
