package Exercicio2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Valores dentro do intervalo [10, 20]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo [10, 20]: " + foraIntervalo);

	}

}
