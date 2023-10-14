package Exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      
			  int x  = sc.nextInt();
			  int y  = sc.nextInt();
	    
	      while(x != 0 && y != 0) {
	        System.out.printf("[%d %d] ", x ,y);
	        
	        if (x > 0 && y > 0) {
	  				System.out.println("primeiro");
	  			}
	  			else if (x < 0 && y > 0) {
	  				System.out.println("segundo");
	  			}
	  			else if (x < 0 && y < 0) {
	  				System.out.println("terceiro");
	  			}
	  			else {
	  				System.out.println("quarto");
	  			}
	        x  = sc.nextInt();
	        y  = sc.nextInt();
	      }
	  

	      sc.close();
	}

}
