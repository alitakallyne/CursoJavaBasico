package com.estruturaDeDados.matriz;

import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = {{10,20,30},{40,50,60}};
		
		System.out.println("Usando forecah");
		
		for (int[] i : matriz) {
			for(int j: i) {
				System.out.println(j);
			}
		}
		
		
		System.out.println("Usando metodo");
		
		
		System.out.println(Arrays.deepToString(matriz));
			

	}

}
