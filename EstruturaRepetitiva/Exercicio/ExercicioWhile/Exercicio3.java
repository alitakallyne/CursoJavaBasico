package Exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      
	      int alcool = 0;
		  	int gasolina = 0;
			  int diesel = 0;
			  
			  int combustivel  = sc.nextInt();
	    
	      while(combustivel  != 4) {
	        switch(combustivel){
	          case 1:
	            System.out.println("Alcool");
	            alcool = alcool + 1;
	          break;
	          case 2:
	            System.out.println("Gasolina");
	            gasolina = gasolina + 1;
	            break;
	          case 3:
	            System.out.println("diesel");
	            diesel = diesel + 1;
	            break;
	          default:
	            System.out.println("codigo invalido");
	        }
	        combustivel  = sc.nextInt();
	      }
	      
	      System.out.println("MUITO OBRIGADO");
	      System.out.println("Alcool: " + alcool);
		  System.out.println("Gasolina: " + gasolina);
		  System.out.println("Diesel: " + diesel);

	      sc.close();
	}

}
