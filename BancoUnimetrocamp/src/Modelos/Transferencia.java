package Modelos;

import java.util.Date;

public class Transferencia {
	private double Valor;
	private Date DataProcesso;
	private Date DataExecucao;
	private Conta ContaOrigem;
	private Cliente ClienteBeneficiado;
	private char Tipo;

	public Transferencia(double valor, Date dataProcesso, Date dataExecucao, Conta contaOrigem,
			Cliente clienteBeneficiado, char tipo) {
		Valor = valor;
		DataProcesso = dataProcesso;
		DataExecucao = dataExecucao;
		ContaOrigem = contaOrigem;
		ClienteBeneficiado = clienteBeneficiado;
		Tipo = tipo;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public Date getDataProcesso() {
		return DataProcesso;
	}

	public void setDataProcesso(Date dataProcesso) {
		DataProcesso = dataProcesso;
	}

	public Date getDataExecucao() {
		return DataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		DataExecucao = dataExecucao;
	}

	public Conta getContaOrigem() {
		return ContaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		ContaOrigem = contaOrigem;
	}

	public Cliente getClienteBeneficiado() {
		return ClienteBeneficiado;
	}

	public void setClienteBeneficiado(Cliente clienteBeneficiado) {
		ClienteBeneficiado = clienteBeneficiado;
	}

	public char getTipo() {
		return Tipo;
	}

	public void setTipo(char tipo) {
		Tipo = tipo;
	}
}
