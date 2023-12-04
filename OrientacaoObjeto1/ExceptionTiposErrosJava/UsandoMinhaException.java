 package br.orientacaoobjeto.basico.aula51;

import br.orientacaoobjeto.basico.aula52.DivisaoNaoExata;

public class UsandoMinhaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    int[] numeros = {4,5, 8, 16, 32, 21,64, 128};
			int[] demon = {2, 0, 4, 8, 0,2,3};

	    for (int i=0; i<numeros.length; i++){
	    	
	      try {
	    	  if(numeros[i] % 2 != 0) {
	    		 throw new DivisaoNaoExata(numeros[i], demon[i]);
	    	  }
	    	  
	        System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
	      } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
	        System.out.println("Aconteceu um Erro");
	        e.printStackTrace();
	      } 
	      
	    }
	}

}
