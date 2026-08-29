package br.com.impacta.exemplo.heranca.teste;

import br.com.impacta.exemplo.heranca.Funcionario;
import br.com.impacta.exemplo.heranca.Programador;

public class Teste {

	public static void main(String[] args) {
		
		
		
		//Utilizando o constructor padrão
		//Programador p = new Programador();
		
		//Utilizando o constructor super()
		Programador p = new Programador("Java","Joaquim", 3.678);
		
		Programador p2 = new Programador();
		
		Funcionario f = new Funcionario();
		
		
	
		
		
		//Atribuindo ao programador os atributos herdados
//		p.setNome("José");
//		p.setSalario(2.567);
//		p.setLinguagem("Java");
		
//		System.out.println("Dados do programador: ");
//		System.out.println("Nome      : " + p.getNome());
//		System.out.println("Salário   :"  + p.alteraSalario());
//		System.out.println("Linguagem : " + p.getLinguagem());
//		
		
		
		String nome1 = "Alê";
		String nome2 = "Alê";
		
		if(nome1 == nome2) {
			System.out.println("VERDADEIRO");
		}else {
			System.out.println("FALSO");
		}
		
		
//		if(nr1.equals( String.valueOf(nr2) )) {
//			System.out.println("VERDADEIRO");
//		}else {
//			System.out.println("FALSO");
//		}
		
		

		
	}

}
