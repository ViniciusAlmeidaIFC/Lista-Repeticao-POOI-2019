package com;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe Dois N�meros");
		System.out.print("Primeiro n�mero(base): ");
		int base = entrada.nextInt();
		System.out.print("Segundo N�mero(Expoente): ");
		int expoente = entrada.nextInt();
		int elevado = base;
		for (int i = 1; i < expoente;i++) {
			elevado = elevado * base;
		}
		System.out.println(base+" Elevado na "+ expoente+" = "+elevado);
		entrada.close();

	}

}
