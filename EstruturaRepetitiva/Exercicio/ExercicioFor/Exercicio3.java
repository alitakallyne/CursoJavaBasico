package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	      
	    int n  = sc.nextInt();
	    
	    for (int i = 0; i<n; i++ ) {
	    	double x1 = sc.nextDouble();
	    	double x2 = sc.nextDouble();
	    	double x3 = sc.nextDouble();
	    	
	    	double media = (x1*2.0)+(x2*3.0)+(x3*5.0)/10.0;
	    	
	    	System.out.printf("Media Poderada dos Valores : %1.f "+media);
	    }
	    
	    sc.close();
	}

}
