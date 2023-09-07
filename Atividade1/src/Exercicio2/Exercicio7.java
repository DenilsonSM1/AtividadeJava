package Exercicio2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite um valor N maior que zero: ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("O valor de N deve ser maior que zero. Tente novamente.");
            }
        } while (N <= 0);

        System.out.println("Valores inteiros entre 1 e " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

	}

}
