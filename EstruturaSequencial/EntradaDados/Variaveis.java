public class Variaveis{

    public static void main(String[] args) {
		System.out.println("Hello World");
		
		//Tipos inteiros
		byte exemplo1 = 127; //8 bits - 1 byte
		short exemplo = 3276; // 16 bits - 2 byte
		int exemploInt = 214748364; //32 bits - 4 byte
		long exemploLong = 1000L; // 64 bits  - 8 byte
		
		//System.out.println(exemplo1);
		//System.out.println(exemplo);
		//System.out.println(exemploInt);
		//System.out.println(exemploLong);
		
		//Tipos decimal
		double teste = (float) 3.123456789;
		//float teste2 = (double) 3.123456789;
		float exp = 3.25865364F; //32 bits - 4 byte
		double expd = 3.25865364; // 64 bits  - 8 byte
		
		
		boolean verdade = true;
		
		char letra = 123;
		char letra2 = 'a';
		
		System.out.println(""+letra+letra2);
		System.out.printf("%c%c",letra2,letra);

		var idade = '2';
		
		String nome = "nome";
	}
}