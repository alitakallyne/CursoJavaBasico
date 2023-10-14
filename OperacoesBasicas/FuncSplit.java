package OpBasicas;

import java.util.Scanner;

public class FuncSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	     
	     String s = "potato apple lemon";
	     String[] vect = s.split(" "); // Recortar a sting de acordo com o separador
	     
	     System.out.println(vect[0]);
	     System.out.println(vect[1]);
	     System.out.println(vect[2]);
	}

}
