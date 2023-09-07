package Exercicio2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = scanner.nextInt();

            if (valor < 1 || valor > 10) {
                System.out.println("O valor deve estar entre 1 e 10. Tente novamente.");
            }
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada do " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

	}

}
