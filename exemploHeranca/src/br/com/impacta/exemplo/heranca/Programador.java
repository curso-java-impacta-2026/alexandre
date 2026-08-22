package br.com.impacta.exemplo.heranca;

public class Programador extends Funcionario{

	 private String linguagem;

	 //Constructor padrão
	 public Programador() {
		super();
	 }
	 
	 //Constructor Full local
	 public Programador(String linguagem) {
		super();
		this.linguagem = linguagem;
	 }
	 
	 //Constructor Full SUPER()
	 public Programador(String linguagem, String nome, double salario) {
		super(nome,salario);
		this.linguagem = linguagem;
	 }
	 
	 public String getLinguagem() {
		 return linguagem;
	 }

	 public void setLinguagem(String linguagem) {
		 this.linguagem = linguagem;
	 }
	 	 
	
}
