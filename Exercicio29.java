package com;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tabuada, inicio, fim;
		System.out.print("Montar a tabuada do: ");
		tabuada = entrada.nextInt();
		System.out.print("Começar por: ");
		inicio = entrada.nextInt();
		do {
		System.out.print("Terminar em: ");
		fim = entrada.nextInt();
		} while(inicio > fim);
		System.out.println("Vou montar a Tabuada do "+ tabuada+
		" começando em "+ inicio+ " e terminando em "+fim+" :");
		for (int i = inicio; i <= fim;i++) {
			System.out.println(tabuada+" x "+i+" = "+ (tabuada*i));
		}
		entrada.close();

	}

}
