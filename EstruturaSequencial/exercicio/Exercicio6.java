package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		
		double Triangulo,raio,trapezio,quadrado,retangulo;
		
		 A = sc.nextDouble();
		 B = sc.nextDouble();
		 C = sc.nextDouble();
		 Locale.setDefault(Locale.US);
				
		Triangulo =  (A * C) / 2;
		raio =  3.14159 * Math.pow(C,2);
		trapezio =  (A + B) * C / 2;
		quadrado = Math.pow(B,2);
		retangulo = A * B;
		
		System.out.printf("TRIANGULO : %.3f %n",Triangulo);
		System.out.printf("CIRCULO : %.3f %n",raio);
		System.out.printf("TRAPEZIO : %.3f %n",trapezio);
		System.out.printf("QUADRADO : %.3f %n",quadrado);
		System.out.printf("RETANGULO : %.3f %n",retangulo);
		sc.close();
	}
}
