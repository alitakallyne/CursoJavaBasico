package br.orientacaoobjeto.basico.aula31;

public class Carro {

	
	  public  String marca;
	  String modelo;
	  int numPassageiro;
	  double capCombustivel;
	  public double consumoCombustivel;

	   public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
	    this.marca = marca;
	    this.modelo = modelo;
	    this.numPassageiro = numPassageiro;
	    this.capCombustivel = capCombustivel;
	    this.consumoCombustivel = consumoCombustivel;
	  }
	   

	  public Carro(){}

	  
	  
	  public Carro(String marca, String modelo, int numPassageiro) {
	    this.marca = marca;
	    this.modelo = modelo;
	    this.numPassageiro = numPassageiro;
	    System.out.println("Chamnando construroe com 3 parametros");
	  }

	  public Carro(String marca, String modelo) {
	    this(marca,modelo,10);
	    System.out.println("Chamnando construroe com 2 parametros");
	  }

	  //Metodo simples
	  void exibirAutonomia(){
	    System.out.println("A autonimia  do carro é: "+capCombustivel*consumoCombustivel+" km");
	  }

	  double obterAutonomia(){
	    System.out.println("Método obter autonimia foi chamado.");
	     return capCombustivel*consumoCombustivel;
	  }

	  private  double divideKmPorConsumoCombustivel(double km){
		    return km/consumoCombustivel;
		  }
	  
	 public  double calculaCombustivel(double km){
	    return this.divideKmPorConsumoCombustivel(km);
	  }



	  @Override
	  public String toString() {
	    return "Carro [marca=" + marca + ", modelo=" + modelo + ", numPassageiro=" + numPassageiro + ", capCombustivel="
	        + capCombustivel + ", consumoCombustivel=" + consumoCombustivel + "]";
	  }
}
