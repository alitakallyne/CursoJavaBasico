package Exercicio;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      
	    int x  = sc.nextInt();
	    if(x <= 1 || x > 1000) {
	    	System.out.print("Informe um número entre o intervalo de 1 a 1000: ");
	    	x  = sc.nextInt();
	    }
	    
	    for (int i = 1; x <= i; i++ ) {
			
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	    
	    sc.close();
	}

}
