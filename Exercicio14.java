package com;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número de termos: ");
		int n = entrada.nextInt();
		int j = 1;
		System.out.print("Série = ");
		for(int i = 1; i <= n; i++) {
			if(i > 1)
				System.out.print(" + ");
			System.out.print(i+"/"+j);
			j = j + 2;
		}
		entrada.close();

	}

}
