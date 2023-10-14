package exercicio;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     
	    double r, res;
	    System.out.println("Valor do raio: ");
	    r = sc.nextDouble();
	    //Fórmula da área: area = π . raio2
	    //Considere o valor de π = 3.14159
	     //A = Math.pow(x, y);
	    res = 3.14159 * Math.pow(r,2);
	    
	    System.out.println(res);
	    
	    sc.close();
	  }
}
