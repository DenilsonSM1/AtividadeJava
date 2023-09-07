package Exercicio2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int totalNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                totalNegativos++;
            }
        }

        System.out.println("Total de valores NEGATIVOS: " + totalNegativos);

	}

}
