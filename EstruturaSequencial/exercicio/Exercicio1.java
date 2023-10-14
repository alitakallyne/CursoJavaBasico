package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	      int n1;
	      System.out.println("Informe um numero: ");
	      n1 = sc.nextInt();
	      System.out.println(n1);
	      int n2;
	      System.out.println("Informe um numero: ");
	      n2 = sc.nextInt();
	      System.out.println(n2);
	     System.out.println("A soma do numero : "+n1+" com o numero :" +n2 +" e : "+(n1+n2));
	    
	     sc.close();
	}

}
