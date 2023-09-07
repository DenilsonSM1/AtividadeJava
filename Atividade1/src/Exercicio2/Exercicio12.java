package Exercicio2;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double soma = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o valor " + i + ": ");
	            double valor = scanner.nextDouble();
	            soma += valor;
	        }

	        double media = soma / 10;
	        System.out.println("A média aritmética dos 10 valores é: " + media);

	}

}
