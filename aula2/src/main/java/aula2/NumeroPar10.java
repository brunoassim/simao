package aula2;

import java.util.Random;
import java.util.Scanner;

public class NumeroPar10 {

	public static void main(String[] args) {
		int c = 0, intCoisa[] = new int[10];// {10, 15, 50 , 80, 100};
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um numero");
		int a = scanner.nextInt();

		for (int i = 0; i < 10; i++) {
			if (a % 2 == 0)
				System.out.println(" " + a);
			else
				i--;
			a--;
			if (a == 1)
				break;
		}

		while (a != 0) {
			if (a % 2 == 0) {
				System.out.println(" " + a);
				c++;
			}
			a--;
			if (c == 10)
				break;

		}

	}

}
