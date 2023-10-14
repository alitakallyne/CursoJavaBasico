package exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    //a ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1
	   
		int cod1;
	    int Qtd1;
	    double Vl_unitario1;
	    double Vl_Peca1 ;
	    
	    cod1 = sc.nextInt();
	    Qtd1 = sc.nextInt();
	    Vl_unitario1 = sc.nextDouble();
	    
	    Vl_Peca1 =  Qtd1*Vl_unitario1;
	    
	    int cod2;
	    int Qtd2;
	    double Vl_unitario2;
	    double Vl_Peca2 ;
	    
	    cod2 = sc.nextInt();
	    Qtd2 = sc.nextInt();
	    Vl_unitario2 = sc.nextDouble();
	    
	    Vl_Peca2=  Qtd2*Vl_unitario2;
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f" ,Vl_Peca1+Vl_Peca2);
	    
	    sc.close();
	}

}
