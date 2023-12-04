package br.orientacaoobjeto.basico.aula25;

public class Carro {

	String marca;
	  String modelo;
	  int numPassageiro;
	  double capCombustivel;
	  double consumoCombustivel;

	  //Metodo simples
	  void exibirAutonomia(){
	    System.out.println("A autonimia  do carro é: "+capCombustivel*consumoCombustivel+" km");
	  }

	  double obterAutonomia(){
	    System.out.println("Método obter autonimia foi chamado.");
	     return capCombustivel*consumoCombustivel;
	  }

	  double calculaCombustivel(double km){
	    return km/consumoCombustivel;
	  }
}
