package application;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
       
        double desc = valor - valor * 0.10;
       
        System.out.printf("%.2f", desc);
		
		sc.close();
	}

}
