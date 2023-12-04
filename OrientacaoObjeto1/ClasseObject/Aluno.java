package br.orientacaoobjeto.basico.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}
	
	
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
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
	

}
