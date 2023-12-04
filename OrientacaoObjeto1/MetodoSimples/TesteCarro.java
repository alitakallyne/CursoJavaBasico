package br.orientacaoobjeto.basico.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro van = new Carro();

	    van.marca = "Fiat";
	    van.modelo = "Ducato";
	    van.numPassageiro = 10;
	    van.capCombustivel = 100;
	    van.consumoCombustivel = 0.2;

	    System.out.println(van);

	    System.out.println(van.marca);
			System.out.println(van.modelo);
	    van.exibirAutonomia();
			
	    double autonomia = van.obterAutonomia();

	    System.out.println("A autonimia do carro é: "+autonomia);

	    double combustivel = van.calculaCombustivel(10.0);
	    System.out.println("A quantidade de combustivel necessaria e : "+combustivel);
	}

}
