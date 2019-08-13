package com;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe Dois Números");
		System.out.print("Primeiro número(base): ");
		int base = entrada.nextInt();
		System.out.print("Segundo Número(Expoente): ");
		int expoente = entrada.nextInt();
		int elevado = base;
		for (int i = 1; i < expoente;i++) {
			elevado = elevado * base;
		}
		System.out.println(base+" Elevado na "+ expoente+" = "+elevado);
		entrada.close();

	}

}
