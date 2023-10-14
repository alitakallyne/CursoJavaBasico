package exercicio;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int cod;
	    int hora;
	    double VlHora;
	    double salario ;
	    
	    cod = sc.nextInt();
	    hora = sc.nextInt();
	    VlHora = sc.nextDouble();
	    
	    salario = hora*VlHora;
	    
	    System.out.println("Number = "+cod);
	    System.out.printf("Salary = U$ %.2f" ,salario);
	    
	    sc.close();
	  }
}
