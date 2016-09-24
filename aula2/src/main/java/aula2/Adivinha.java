package aula2;

import java.util.Random;
import java.util.Scanner;
//control shif f pra organizar o codigo, identaçao do codigo
public class Adivinha {
	public static void main(String[] args) {
		int a = -1, c = 0, intCoisa[] = new int[5];// {10, 15, 50 , 80, 100};
		Scanner scanner = new Scanner(System.in);
		int b = new Random().nextInt(10) + 1;// GERA NUMERO ALEATORIO
		for (int i : intCoisa) {
			System.out.println(i);
		}
		while (a != b) {
			System.out.println("digite um numero");
			int i = scanner.nextInt();
			a = i; // VARIAVEL AUXILIAR
			c++;// CONTADOR
			b = new Random().nextInt(10) + 1;// GERA NUMERO ALEATÓRIO
			if (c > 8) { // CODIÇAO LIMITADORA DO LOOP
				System.out.println("perdeu");
				break;
			}
		}
		if (c <= 8)
			System.out.println("Você acertou em " + c + "tentativas");
	}

}
