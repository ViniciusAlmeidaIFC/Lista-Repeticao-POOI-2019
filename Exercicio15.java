package com;

public class Exercicio15 {

	public static void main(String[] args) {
		int j = 38;
		int i = 37;
		double soma = 0;
		
		System.out.print("Série = ");
		for(int k = 1; k <= 37; k++) {
			if (k >= 2)
				System.out.print(" + ");
			System.out.print("("+i+"*"+j+")/"+k);
			soma = soma + ((i*j)/k);
			i--;
			j--;
		}
		System.out.println("\nA soma da série é "+soma);

	}

}
