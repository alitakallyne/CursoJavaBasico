package br.orientacaoobjeto.basico.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro van = new Carro();
	    van.marca = "Fiat";
	    van.modelo = "Ducato";
	    van.numPassageiro = 10;
	    van.capCombustivel = 100;
	    van.consumoCombustivel = 0.2;

	    System.out.println(van.toString());
	}

}
