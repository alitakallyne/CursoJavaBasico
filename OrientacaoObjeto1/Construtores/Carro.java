package br.orientacaoobjeto.basico.aula29;

public class Carro {

	
	String marca;
	  String modelo;
	  int numPassageiro;
	  double capCombustivel;
	  double consumoCombustivel;

	  Carro(){
	    System.out.println("Classe instanciada");
	  }

	  

	  public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
	    this.marca = marca;
	    this.modelo = modelo;
	    this.numPassageiro = numPassageiro;
	    this.capCombustivel = capCombustivel;
	    this.consumoCombustivel = consumoCombustivel;
	  }



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



	  @Override
	  public String toString() {
	    return "Carro [marca=" + marca + ", modelo=" + modelo + ", numPassageiro=" + numPassageiro + ", capCombustivel="
	        + capCombustivel + ", consumoCombustivel=" + consumoCombustivel + "]";
	  }
}
