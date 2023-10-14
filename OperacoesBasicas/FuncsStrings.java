package OpBasicas;

import java.util.Scanner;

public class FuncsStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     
	     String original = "abcde FGHIJ ABC abc DEFG ";
	     
	     String s01 = original.toLowerCase(); // Minusculo
	     String s02 = original.toUpperCase(); // Maiusculo
	     String s03 = original.trim(); // Elimina espaço em branco
	     String s04 = original.substring(2); // Imprime string a partir da posição que vc colocar
	     String s05 = original.substring(2,9);// Recortar string do 2 ao 9
	     String s06 = original.replace('a','x'); // Troca 'a' por 'x', se encontrar 'a' na string
	     String s07 = original.replace("abc","xy"); // Troca 'abc' por 'xy', se encontrar 'abc' na string
	     int i = original.indexOf("bc"); // Encontra primeira posição de 'bc' na string
	     int j = original.lastIndexOf("bc"); // Encontra a ultima posição de 'bc' na string
	     
	     System.out.println("Original: -" + original +"-");
	     System.out.println("toLowerCase: -" + s01 + "-");
	     System.out.println("toUpperCase: -" + s02 + "-");
	     System.out.println("trim: -" + s03 + "-");
	     System.out.println("substring(2): -" + s04 + "-");
	     System.out.println("substring(2,9): -" + s05 + "-");
	     System.out.println("replace('a','x'): -" + s06 + "-");
	     System.out.println("replace('abc','xy'): -" + s07 + "-");
	     System.out.println("Index of 'bc' "+ i);
	     System.out.println("Last Index of 'bc' "+ j);
	}

}
