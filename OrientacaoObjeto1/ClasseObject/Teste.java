package br.orientacaoobjeto.basico.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Sistemas de informação");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Sistemas de informação");
		double[] notas2 = {10,9,8,7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno2);
		
		System.out.println(aluno.equals(aluno2));
	}
}
