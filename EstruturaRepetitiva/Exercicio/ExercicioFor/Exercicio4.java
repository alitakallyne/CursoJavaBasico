package Exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);

	      int n = sc.nextInt();
	      double valor;
	      
	      for(int i = 1; i <= n; i++){
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	       
	        if(y == 0){
	          System.out.println("divisao impossivel");
	        }else {
	          valor = (double) x/y;
	          System.out.printf("%.1f%n", valor);
	        }
	        
	      }
	}

}
