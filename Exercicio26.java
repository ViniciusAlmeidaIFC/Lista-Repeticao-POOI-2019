package com;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Pre�o do P�o: R$ ");
		float pao = entrada.nextFloat();
		System.out.println("Panificadora P�o de Ontem - Tabela de Pre�os");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+"- R$ "+(pao*i));
		}
		entrada.close();
	}

}
