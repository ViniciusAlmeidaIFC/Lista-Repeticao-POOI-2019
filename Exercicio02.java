package com;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		String nome;
		String senha;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o usuário: ");
		nome = entrada.nextLine();
		do {
			System.out.print("Informe a senha: ");
			senha = entrada.nextLine();
		}while (nome.equalsIgnoreCase(senha));
		
		entrada.close();
	}

}
