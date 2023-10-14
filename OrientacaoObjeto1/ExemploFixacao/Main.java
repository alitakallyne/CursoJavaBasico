package ExemploFixacao;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);
	     
	     Account account;
	     
	     System.out.print("Enter account number: ");
	     int num = sc.nextInt();
	     System.out.print("Enter account holder: ");
	     sc.nextLine();
	     String name = sc.nextLine();
	     System.out.print("Is there na initial deposit (y/n)? ");
	     char op = sc.next().charAt(0);
	     
	     
	     if(op == 'y') {
	    	 System.out.print("Enter initial deposit value : ");
	    	 double initialDeposit = sc.nextDouble();
	    	account = new Account(num,name,initialDeposit);
	     }else {
	    	 account = new Account(num, name);
	     }
	     
	      
	     System.out.println();
	     System.out.println("Product data: ");
	     System.out.println(account);
	     
	     System.out.println();
	     System.out.print("Enter deposit value : ");
	     double depositValue = sc.nextDouble();
	     account.deposit(depositValue);
	     
	     System.out.println();
	     System.out.println("Product data: ");
	     System.out.println(account);
	     
	     System.out.println();
	     System.out.print("Enter withdraw value : ");
	     double withdrawValue = sc.nextDouble();
	     account.withdraw(withdrawValue);
	     
	     System.out.println();
	     System.out.println("Product data: ");
	     System.out.println(account);
	     
	     
	     sc.close();
	}

}
