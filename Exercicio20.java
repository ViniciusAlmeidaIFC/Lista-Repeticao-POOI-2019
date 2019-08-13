package com;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		double nota, soma = 0;
		char saida;
		do {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			soma = soma + nota;
			cont++;
			System.out.println("Deseja sair? s- sim n- não");
			saida = entrada.next().toLowerCase().charAt(0);
		}while (saida != 's');
		System.out.print("A média é de: "+ (soma/cont));
		entrada.close();

	}

}
