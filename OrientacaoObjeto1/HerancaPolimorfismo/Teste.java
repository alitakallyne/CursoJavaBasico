package br.orientacaoobjeto.basico.aula40;
//Polimorfismo = usando o mesmo metodo, obterEtiquetaEndereco para classes diferentes.

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa prof = new Professor();
		
		
		pessoa.setEndereco(" Rua 1,num 1 ");
		aluno.setEndereco(" Rua 2, num 2 ");
		prof.setEndereco(" Rua 3, num 3 ");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(prof.obterEtiquetaEndereco());
		
		
	}

}
