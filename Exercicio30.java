package com;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod = 0;
		float altura = 0;
		float peso = 0;
		int qtd = 0;
		float maisAlt = 0;
		float maisBai = 0;
		float maisMag = 0;
		float maisGor = 0;
		int codAlt = 0;
		int codBai = 0;
		int codMag = 0;
		int codGor = 0;
		float pesAlt = 0;
		float pesBai = 0;
		float altMag = 0;
		float altGor = 0;
		float somaAlt = 0;
		float somaPes = 0;

		do {
			qtd++;
			System.out.println(qtd + "� cliente:");
			System.out.print("Informe seu c�digo: ");
			cod = entrada.nextInt();
			if (cod != 0) {
				System.out.print("Informe sua altura: ");
				altura = entrada.nextFloat();
				System.out.print("Informe seu peso: ");
				peso = entrada.nextFloat();

				if (qtd == 1) {
					maisAlt = altura;
					codAlt = cod;
					pesAlt = peso;
					
					maisBai = altura;
					codBai = cod;
					pesBai = peso;
					
					maisMag = peso;
					codMag = cod;
					altMag = altura;
					
					maisGor = peso;
					codGor = cod;
					altGor = altura;
				} else {
					if (altura > maisAlt) {
						maisAlt = altura;
						codAlt = cod;
						pesAlt = peso;
					}
					if (altura < maisBai) {
						maisBai = altura;
						codBai = cod;
						pesBai = peso;
					}
					if (peso > maisGor) {
						maisGor = peso;
						codGor = cod;
						altGor = altura;
					}
					if (peso < maisMag) {
						maisMag = peso;
						codMag = cod;
						altMag = altura;
					}
				}
				somaAlt = somaAlt + altura;
				somaPes = somaPes + peso;
			}
			else 
				qtd--;
		} while (cod != 0);
		float mediaAlt = somaAlt / qtd;
		float mediaPes = somaPes / qtd;
		System.out.println("Mais alto: C�digo: " + codAlt + " | Altura: " + maisAlt+" | Peso: "+pesAlt);
		System.out.println("Mais baixo: C�digo: " + codBai + " | Altura: " + maisBai+" | Peso: "+pesBai);
		System.out.println("Mais magro: C�digo: " + codMag + " | Altura: "+altMag+" | Peso: " + maisMag);
		System.out.println("Mais gordo: C�digo: " + codGor + " | Altura: "+altGor+" | Peso: " + maisGor);
		System.out.println("\nM�dia de alturas: " + mediaAlt);
		System.out.println("M�dia de pesos: " + mediaPes);
		
		entrada.close();

	}

}
