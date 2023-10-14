package Exercicio;

import java.util.Scanner;

public class Exercicio1 {
	//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		int n;
		System.out.println("Informe um numero: ");
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("POSITIVO");
		}
		
		sc.close();
	}

}
