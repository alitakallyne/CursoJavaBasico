package br.orientacaoobjeto.basico.aula41;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereco do Aluno";
		
	//	s += this.getEndereco();
		
		return s;
	}
	
	
	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereco do aluno");
		System.out.println(this.obterEtiquetaEndereco());
	}

}
