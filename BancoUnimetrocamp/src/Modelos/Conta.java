package Modelos;

import java.util.Date;

public class Conta {
	private Date DataCriacao;
	private String Tipo;
	private double Saldo;
	private double ChequeEspecial;

	public Conta(Date dataCriacao, String tipo, double saldo, double chequeEspecial) {
		DataCriacao = dataCriacao;
		Tipo = tipo;
		Saldo = saldo;
		ChequeEspecial = chequeEspecial;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public double getChequeEspecial() {
		return ChequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		ChequeEspecial = chequeEspecial;
	}
}
