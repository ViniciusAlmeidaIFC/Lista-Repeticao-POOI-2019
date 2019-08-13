package com;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		
		int soma = 1;
		
		System.out.print(num+"!=");
		for(int i = 1; i <= num; i++) {
			if (i != num)
			System.out.print(i+".");
			else 
				System.out.print(i+"=");
			soma = soma * i;
		}
		System.out.println(soma);
		entrada.close();

	}

}
