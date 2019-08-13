package com;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de pessoas: ");
		int qtd = entrada.nextInt();

		int soma = 0;
		for (int i = 0; i < qtd; i++) {
			System.out.println("Informe a idade da " + (i + 1) + "ª pessoa");
			int idade = entrada.nextInt();
			soma = soma + idade;
		}
		float media = soma / qtd;

		if (media <= 25)
			System.out.println("Turma jovem");
		else {
			if (media <= 60) {
				System.out.println("Turma adulta");
			} else {
				System.out.println("Turma idosa");
			}
		}
		entrada.close();

	}

}
