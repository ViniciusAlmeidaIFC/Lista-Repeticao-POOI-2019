package com;

public class Exercicio04 {

	public static void main(String[] args) {
		float pesA = 80000;
		float pesB = 200000;
		float taxaA = (float)1.03;
		float taxaB = (float)1.015;
		int qtdAnos = 0;
		
		do {
			pesA = pesA * (float)taxaA;
			pesB = pesB * (float)taxaB;
			qtdAnos++;
		}while(pesA <= pesB);
		
		System.out.println("A quantidade necessária é "+qtdAnos+ " anos");
		
	}

}
