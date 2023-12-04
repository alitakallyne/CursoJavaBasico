package br.orientacaoobjeto.basico.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entre com um numero");
		try {
			double num = lerNumero();
			System.out.println("Vc digitou "+num);
		} catch (Exception e) {
			System.out.println("Entrada invalida");
			e.printStackTrace();
		}

	}
	
	public static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		
		return num;
	}

}
