package com;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Preço do Pão: R$ ");
		float pao = entrada.nextFloat();
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+"- R$ "+(pao*i));
		}
		entrada.close();
	}

}
