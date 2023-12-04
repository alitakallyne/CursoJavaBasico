package br.orientacaoobjeto.basico.aula41;

import br.orientacaoobjeto.basico.aula41.Aluno;
import br.orientacaoobjeto.basico.aula41.Pessoa;
import br.orientacaoobjeto.basico.aula41.Professor;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Pessoa prof = new Professor();
		
		
		//pessoa.setEndereco(" Rua 1,num 1 ");
		//aluno.setEndereco(" Rua 2, num 2 ");
		prof.setEndereco(" Rua 3, num 3 ");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(prof.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		prof.imprimirEtiquetaEndereco();
		
	}

}
