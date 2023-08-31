package exercicio1;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = scanner.nextDouble();
        
        double comissao = 0.03 * Math.min(valorVendas, 1500.0) + 0.05 * Math.max(valorVendas - 1500.0, 0.0);
        
        double salarioTotal = salarioFixo + comissao;
        
        System.out.println("Salário total do vendedor: R$ " + salarioTotal);
        
        scanner.close();

	}

}
