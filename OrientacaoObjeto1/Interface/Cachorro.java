package br.orientacaoobjeto.basico.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
  
  private int tamanho;
  private String raca;
  
  public int getTamanho() {
    return tamanho;
  }
  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }
  public String getRaca() {
    return raca;
  }
  public void setRaca(String raca) {
    this.raca = raca;
  }
  @Override
  public void amamentar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'amamentar'");
  }
  @Override
  public void emitirSom() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
  }
  @Override
  public void brincar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'brincar'");
  }
  @Override
  public void levarPassear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'levarPassear'");
  }
  @Override
  public void levarVeterinario() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'levarVeterinario'");
  }
  @Override
  public void alimentar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'alimentar'");
  }

  
}
