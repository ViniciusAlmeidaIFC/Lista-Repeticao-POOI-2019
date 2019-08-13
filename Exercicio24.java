package com;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de CDs: ");
		int qtd = entrada.nextInt();
		float valor = 0;
		float soma = 0;
		
		for(int i = 0; i < qtd; i ++) {
			System.out.print("Informe o valor gasto no "+(i+1)+"º CD :");
			valor = entrada.nextFloat();
			soma = soma + valor;
		}
		float media = soma / qtd;
		System.out.println("O valor total gasto na coleção de CDs é "+soma+" R$");
		System.out.println("A média de gastos nos CDs é "+media+" R$");
		
		entrada.close();

	}

}
