package com;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Lojas Tabajara");
		int cont = 1;
		float soma = 0;
		float num, pagamento;
		do {
			System.out.print("Produto "+cont+" R$");
			num = entrada.nextFloat();
			soma = soma + num;
			cont++;
		}while (num != 0); 
		do {
		System.out.print("Dinheiro: R$ ");
		pagamento = entrada.nextFloat();
		}while (pagamento < soma);
		System.out.println("Troco: R$ "+ (pagamento - soma));
		entrada.close();

	}

}
