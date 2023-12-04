package br.orientacaoobjeto.basico.aula47;

public class Excecao {
  public static void main(String[] args) {

    try{
      int[] vetor = new int[4];

      System.out.println("Antes da Exceção");

      vetor[4] = 1;
      System.out.println("Depois da Exceção");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exceção ao acessar um índide do vetor que não existe");
    }
    System.out.println("Esse texto será impresso após a exception");
  }
}
