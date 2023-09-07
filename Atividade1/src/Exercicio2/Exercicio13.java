package Exercicio2;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de alunos na turma: ");
	        int numAlunos = scanner.nextInt();

	        if (numAlunos <= 0) {
	            System.out.println("Número de alunos inválido. Deve ser maior que zero.");
	            return;
	        }

	        double somaNotas = 0;

	        for (int i = 1; i <= numAlunos; i++) {
	            System.out.print("Digite a nota do aluno " + i + ": ");
	            double nota = scanner.nextDouble();
	            somaNotas += nota;
	        }

	        double media = somaNotas / numAlunos;
	        System.out.println("A média aritmética das notas é: " + media);
	}

}
