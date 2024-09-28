package application;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário: ");
		double salary = sc.nextDouble();

		System.out.print("Digite o número de pendências: ");
		short pendencias = sc.nextShort();

		if (salary >= 2500 && pendencias < 2) {
			System.out.println("Empréstimo aprovado!");
			System.out.print("Digite o valor do empréstimo: ");
			double valorEmprestimo = sc.nextDouble();
			
			System.out.print("Número de parcelas: ");
			short numeroParcelas = sc.nextShort();

			double juros = valorEmprestimo * 0.9 * numeroParcelas / 100;
			double valorTotalPagar = valorEmprestimo + juros;
			double valorParcela = valorTotalPagar / numeroParcelas;
	
			System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotalPagar);
			System.out.printf("Valor das parcelas: R$ %.2f", valorParcela);
		} else {
			System.out.println("Empréstimo não aprovado!");
		}

		sc.close();
	}

}
