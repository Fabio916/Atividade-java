package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite o salário: ");
	        double salary = sc.nextDouble();
	       
	        System.out.print("Digite o número de pendências: ");
	        short pendencias = sc.nextShort();
	       
	        if (salary >= 2500 && pendencias < 2) {
	            System.out.println("Empréstimo aprovado!");
	        }
	        else{
	            System.out.println("Empréstimo não aprovado!");
	        }
		
		sc.close();
	}

}
