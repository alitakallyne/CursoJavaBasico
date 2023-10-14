package Exercicio;

import java.util.Scanner;

public class Exercicio2 {
	//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
		
		int n;
		System.out.println("Informe um numero: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
