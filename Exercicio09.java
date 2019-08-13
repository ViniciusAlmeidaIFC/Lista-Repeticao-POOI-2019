package com;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe qual tabuada deseja ver: 1 a 10: ");
		int num;
		do {
			num = entrada.nextInt();
		}while (num < 1 || num > 10);
		System.out.println("Tabuada do "+num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+" x "+i+" = "+ num*i);
		}
		entrada.close();

	}

}
