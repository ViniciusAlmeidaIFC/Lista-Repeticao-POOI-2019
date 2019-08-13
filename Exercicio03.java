package com;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.print("Informe seu nome: ");
			nome = entrada.nextLine();
		}while (nome.length() <= 3);
		
		do {
			System.out.print("Informe seu Sexo F-Feminino e M-Masculino: ");
			sexo = entrada.nextLine();
		}while (!("m".equalsIgnoreCase(sexo) || "f".equalsIgnoreCase(sexo)));
		
		do {
			System.out.print("Informe seu Estado Cívil s-Solteiro(a), c-Casado(a), v-Viúvo(a) ou d-Divorciado(a): ");
			estadoCivil = entrada.nextLine();
		}while (!("s".equalsIgnoreCase(estadoCivil) ||"c".equalsIgnoreCase(estadoCivil) || "v".equalsIgnoreCase(estadoCivil) || "d".equalsIgnoreCase(estadoCivil)));
		 
		do {
			System.out.print("Informe sua Idade: ");
			idade = entrada.nextInt();
		}while (idade <= 0 || idade >= 150);
		
		do {
			System.out.print("Informe seu Salario: ");
			salario = entrada.nextDouble();
		}while (salario <= 0);
		
		
		
		entrada.close();

	}

}
