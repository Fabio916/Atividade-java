package application;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a distância percorrida (em km): ");
		double distancia = sc.nextDouble();

		System.out.print("Digite a quatidade de combustível consumido (em litros): ");
		double litros = sc.nextDouble();

		double consumoMedio = distancia / litros;
		System.out.println(consumoMedio + " Km/L");

		sc.close();
	}

}
