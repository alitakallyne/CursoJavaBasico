package Exercicio;

import java.util.Scanner;

public class Exercicio3 {
	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		ordem crescente ou decrescente.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); 
		
		int A;
		int B;
		System.out.println("Informe um numero: ");
		A = sc.nextInt();
		System.out.println("Informe um numero: ");
		B = sc.nextInt();
		
		if (A % B == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
