package EntradaDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Vc digitou: "+ x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Vc digitou: "+ y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Vc digitou: "+ z);
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Vc digitou: "+ c);
		
		sc.close();
	}

}
