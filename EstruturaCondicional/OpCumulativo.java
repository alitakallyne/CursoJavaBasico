package condicional;

import java.util.Locale;
import java.util.Scanner;

public class OpCumulativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      int minutos = sc.nextInt();
      double conta = 50.0;
      
      if (minutos > 100){
        conta += (minutos - 100)*2;
      }
      
      System.out.printf("O valor da conta = R$ %.2f%n", conta);
      
      sc.close();
	      

	}

}
