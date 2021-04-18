package Modelos;

public class RecargaCelular {
	private int DDD;
	private String NumeroCelular;
	private String Operadora;
	private String NomeBeneficiado;
	private Double Valor;

	public RecargaCelular(int ddd, String numeroCelular, String operadora, String nomeBeneficiado, Double valor) {
		DDD = ddd;
		NumeroCelular = numeroCelular;
		Operadora = operadora;
		NomeBeneficiado = nomeBeneficiado;
		Valor = valor;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public String getNumeroCelular() {
		return NumeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		NumeroCelular = numeroCelular;
	}

	public String getOperadora() {
		return Operadora;
	}

	public void setOperadora(String operadora) {
		Operadora = operadora;
	}

	public String getNomeBeneficiado() {
		return NomeBeneficiado;
	}

	public void setNomeBeneficiado(String nomeBeneficiado) {
		NomeBeneficiado = nomeBeneficiado;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}
}
