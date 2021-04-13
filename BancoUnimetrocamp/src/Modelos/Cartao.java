package Modelos;

import java.util.List;

public class Cartao {
	private String Numero;
	private int CDV;
	private double Limite;
	private List<String> Fatura;
	
	public Cartao(String numero, int cdv, double limite) {		
		Numero = numero;
		CDV = cdv;
		Limite = limite;		
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public int getCDV() {
		return CDV;
	}

	public void setCDV(int cDV) {
		CDV = cDV;
	}

	public double getLimite() {
		return Limite;
	}

	public void setLimite(double limite) {
		Limite = limite;
	}

	public List<String> getFatura() {
		return Fatura;
	}

	public void setFatura(List<String> fatura) {
		Fatura = fatura;
	}
}
