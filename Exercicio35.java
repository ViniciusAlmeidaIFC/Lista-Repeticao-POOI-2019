package com;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Especificação    Código Preço");
		System.out.println(
				"Cachorro Quente  100    R$ 1,20 "
				+ "\nBauru Simples    101    R$ 1,30 "
				+ "\nBauru com ovo    102    R$ 1,50 "
				+ "\nHambúrguer       103    R$ 1,20 "
				+ "\nCheeseburguer    104    R$ 1,30 "
				+ "\nRefrigerante     105    R$ 1,00");
		int cod;
		int qtd;
		float preco = 0;
		float total = 0;
		char saida;
		do {
		System.out.print("Informe o código do produto: ");
		cod = entrada.nextInt();
		System.out.print("Informe a quantidade: ");
		qtd = entrada.nextInt();
		if (cod == 100) {
			preco = qtd * (float) 1.20;
			System.out.println(qtd+" Cachorro Quente: R$ " + preco);
		} else {
			if (cod == 101) {
				preco = qtd * (float) 1.30;
				System.out.println(qtd+" Bauru Simples: R$ " + preco);
			} else {
				if (cod == 102) {
					preco = qtd * (float) 1.50;
					System.out.println(qtd+" Bauru com ovo: R$ " + preco);
				} else {
					if (cod == 103) {
						preco = qtd * (float) 1.20;
						System.out.println(qtd+" Hambúrguer: R$ " + preco);
					} else {
						if (cod == 104) {
							preco = qtd * (float) 1.30;
							System.out.println(qtd+" Cheeseburguer: R$ " + preco);
						} else if (cod == 105) {
							preco = qtd * (float) 1.00;
							System.out.println(qtd+" Refrigerante: R$ " + preco);
						}
						else 
							System.out.println("Código errado!");
					}
				}
			}
		}
		total = total + preco;
		System.out.print("Informe s para encerrar o pedido: ");
		saida = entrada.next().toLowerCase().charAt(0);
		}while (saida != 's');
		System.out.println("Total: R$ " + total);
		entrada.close();

	}

}
