package com;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double menor = 0, maior = 0, soma = 0;
		int num;
		System.out.print("Informe quantos n�meros o programa ir� utilizar: ");
		num = entrada.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("Informe o "+(i+1)+"� n�mero: ");
			int k = entrada.nextInt();
			if (i == 0)
				maior = menor = k;
			else if (k > maior) 
				maior = k;
			else if (k < menor)
				menor = k;
			soma = soma + k;
		}
		System.out.println("O maior n�mero � o: "+maior);
		System.out.println("O menor n�mero � o: "+menor);
		System.out.println("A soma dos n�meros �: "+soma);
		entrada.close();

	}

}
