package com;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float maior = 0, menor = 100000000;
		float soma = 0;
		int cont = 0;
		float temp;
		char saida;
		System.out.println("Sistema de Temperaturas");
		do {
			System.out.print("Informe a temperatura: ");
			temp = entrada.nextFloat();
			if (cont == 0) {
				maior = temp;
				menor = temp;
			}
			else if (temp > maior)
				maior = temp;
			else 
				menor = temp;
			soma = soma + temp;
			cont++;
			System.out.print("Informe s para sair do programa: ");
			saida = entrada.next().toLowerCase().charAt(0);
		}while (saida != 's');
		System.out.println("Maior = "+ maior);
		System.out.println("Menor = "+ menor);
		System.out.println("Média = "+ (soma / cont));
		entrada.close();
	}

}
