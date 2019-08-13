package com;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		do {
			System.out.print("Informe um número: ");
			num = entrada.nextInt();
		} while (num < 1);

		String numString = String.valueOf(num);
		int tamanho = numString.length();
		
		char letra = 0;
		for(int i = (tamanho-1); i >= 0; i--) {
			letra = numString.charAt(i);
			System.out.print(letra);
		}
		
		entrada.close();


	}

}
