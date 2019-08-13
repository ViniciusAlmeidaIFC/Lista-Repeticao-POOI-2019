package com;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtd = 10;
		int cod[] = new int[qtd];
		float alt[] = new float[qtd];
		float maisAlt = 0;
		float maisBai = 0;
		int codAlt = 0;
		int codBai = 0;

		for (int i = 0; i < qtd; i++) {
			System.out.print("Informe o código do " + (i + 1) + "º aluno: ");
			cod[i] = entrada.nextInt();
			System.out.print("Informe a altura do " + (i + 1) + "º aluno: ");
			alt[i] = entrada.nextFloat();

			if (i == 0) {
				maisAlt = alt[i];
				maisBai = alt[i];
				codAlt = cod[i];
				codBai = cod[i];
			} else {
				if (alt[i] > maisAlt) {
					maisAlt = alt[i];
					codAlt = cod[i];
				}
				if (alt[i] < maisBai) {
					maisBai = alt[i];
					codBai = cod[i];
				}
			}
		}
		
		System.out.println("Mais alto: Código: "+codAlt+" | Altura: "+maisAlt);
		System.out.println("Mais baixo: Código: "+codBai+" | Altura: "+maisBai);

		entrada.close();

	}

}
