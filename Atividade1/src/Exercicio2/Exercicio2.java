package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double primeiroValor, segundoValor;

        System.out.print("Informe o primeiro valor: ");
        primeiroValor = scanner.nextDouble();

        System.out.print("Informe o segundo valor (não pode ser zero): ");
        segundoValor = scanner.nextDouble();

        while (segundoValor == 0) {
            System.out.println("O segundo valor não pode ser zero. Tente novamente.");
            System.out.print("Informe o segundo valor (não pode ser zero): ");
            segundoValor = scanner.nextDouble();
        }

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);

	}

}
