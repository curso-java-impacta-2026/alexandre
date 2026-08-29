package br.com.impacta.laboratorio;

public class RG {
	private int numero;
	private String dtNasc;
		
	public RG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RG(int numero, String dtNasc) {
		super();
		this.numero = numero;
		this.dtNasc = dtNasc;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	
	
}
