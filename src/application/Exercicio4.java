package application;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
		"Menu\n" 
		+ "[1]- Hambúrguer (R$ 10)\n" 
		+ "[2]- Cachorro Quente (R$ 7)\n" 
		+ "[3]- Batata Frita (R$ 5)\n");
		System.out.print("Escolha seu lanche: ");
		short lanche = sc.nextByte();
		
		System.out.print("Você escolheu: ");
		switch (lanche) {
		case 1:
			System.out.println("Hambúrguer\n"
					+ "Valor a ser pago: R$ 10,00");
			break;
		case 2:
			System.out.println("Cachorro quente\n"
					+ "Valor a ser pago: R$ 7,00");
			break;
		case 3:
			System.out.println("Batata Frita\n"
					+ "Valor a ser pago: R$ 5,00");
		default:
			System.out.println("Opção Inválida!");
		}

		sc.close();

	}

}
