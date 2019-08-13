package com;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int k = 0;
		float valordivida = 0;
		float valorjuros = 0;
		int qtparcelas = 0;
		float valorparcela = 0;
		boolean sistema = false;
		
		
		while (!sistema) {
			
			k++;
			System.out.printf(k+"ª dívida");
			
			do {
				System.out.print("\nValor da dívida: ");
				valordivida = entrada.nextFloat();
			}while(valordivida<0);
						
			do {
				System.out.print("Quantidade de parcelas: ");
				qtparcelas = entrada.nextInt();
			}while (((qtparcelas != 1) && (qtparcelas != 3) && (qtparcelas != 6) && (qtparcelas != 9) && (qtparcelas != 12) && ((qtparcelas<0)||(qtparcelas>12))));
			
			switch (qtparcelas) {
				case (1):
					valorjuros = 0;
					break;
				case (3):
					valorjuros = 100;
					break;
				case (6):
					valorjuros = 150;
					break;
				case(9):
					valorjuros = 200;
					break;
				case(12):
					valorjuros = 250;
					break;
				default:
					System.out.println("Valor inválido");
					break;
		}

			if (valordivida < 1000)
				valorjuros = 0;
			
			System.out.println("Valor da dívida: "+valordivida);
			System.out.println("Valor dos juros: "+valorjuros);
			System.out.println("Quantidade de parcelas: "+qtparcelas);
			valorparcela = valordivida / qtparcelas;
			System.out.println("Valor da parcela: "+valorparcela);
			System.out.print("\nDeseja parar? (true/false) ");
			sistema = entrada.nextBoolean();	
		}
		entrada.close();

	}

}
