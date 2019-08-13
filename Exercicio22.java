package com;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o n�mero total de votantes: ");
		int qtd = entrada.nextInt();
		int voto = 0;
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		for (int i = 0; i < qtd; i++) {
			do {
				System.out.print(
						"Informe o voto do " + (i + 1) + "� votante"
								+ " (1 - Fulano | 2 - Beltrano | 3 - Ciclano): ");
				voto = entrada.nextInt();
			} while (voto < 1 || voto > 3);
			if(voto == 1)
				v1++;
			else {
				if(voto == 2)
					v2++;
				else {
					v3++;
				}
			}
		}
		System.out.println("Quantidade de votos de cada candidato: ");
		System.out.println("1� - Fulano, "+v1+" votos");
		System.out.println("2� - Beltrano, "+v2+" votos");
		System.out.println("3� - Ciclano, "+v3+" votos");
		entrada.close();

	}

}
