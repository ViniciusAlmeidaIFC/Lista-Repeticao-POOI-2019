package com;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int um = 0;
		int dois = 0;
		System.out.print("Informe o primeiro número: ");
		um = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		dois = entrada.nextInt();
		int aux = 0;
		int aux2 = 0;
		if (um > dois) {
			aux = dois;
			aux2 = um;
		} else {
			aux = um;
			aux2 = dois;
		}
		for (int i = (aux+1); i < aux2; i++) {
			System.out.println(i);
		}
		
		entrada.close();
	}

}
