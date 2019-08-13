package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		int voto = 0;
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		int v5 = 0;
		int v6 = 0;
		do {
			do {
				System.out.println(
						"Candidatos: \n1 - José \n2 - João \n3 - Mathias \n4 - Artur \n5 - Voto Branco \n6 - Voto em Branco ");
				System.out.print("Seu voto: ");
				voto = entrada.nextInt();
			} while (voto < 0 || voto > 6);

			if (voto != 0) {
				i++;
				if (voto == 1)
					v1++;
				else {
					if (voto == 2)
						v2++;
					else {
						if (voto == 3)
							v3++;
						else {
							if (voto == 4)
								v4++;
							else {
								if (voto == 5)
									v5++;
								else {
									v6++;
								}
							}
						}
					}
				}
			}
		} while (voto != 0);

		float percNulo = ((float)v5/(float)i)*100;
		float percBranco = ((float)v6/(float)i)*100;
		
		System.out.println("Quantidade de votos: "
				+ "\n1 - José           = "+v1
				+ "\n2 - João           = "+v2
				+ "\n3 - Mathias        = "+v3
				+ "\n4 - Artur          = "+v4
				+ "\n5 - Voto Branco    = "+v5
				+ "\n6 - Voto em Branco = "+v6);
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Percentual de votos nulos: "+df.format(percNulo)+"%");
		System.out.println("Percentual de votos brancos "+df.format(percBranco)+"%");
		
		entrada.close();

	}

}
