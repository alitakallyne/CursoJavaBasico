package Repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      
	      int n  = sc.nextInt();
	      int soma = 0;
	      while(n != 0) {
	        n = sc.nextInt();
	        soma += n;
	      }
	      
	      System.out.println("soma = " + soma);
	      sc.close();
	}

}
