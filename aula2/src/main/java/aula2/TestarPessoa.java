package aula2;

import java.util.Random;
import java.util.Scanner;

public class TestarPessoa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = scanner.nextLine();
		System.out.println("Digite o seu cpf");
		String cpf = scanner.nextLine();
		System.out.println("Digite o seu RG");
		int rg = scanner.nextInt();
		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.cpf);
		System.out.println(pessoa.rg);

	}

}
