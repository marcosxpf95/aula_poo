package Modelos;

import java.util.Date;
import java.util.List;

public class Historico {
	private Date Data;
	private Cliente Cliente;
	private List<String> DetalheMovimentacao;

	public Historico(Date data, Modelos.Cliente cliente, List<String> detalheMovimentacao) {
		Data = data;
		Cliente = cliente;
		DetalheMovimentacao = detalheMovimentacao;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public List<String> getDetalheMovimentacao() {
		return DetalheMovimentacao;
	}

	public void setDetalheMovimentacao(List<String> detalheMovimentacao) {
		DetalheMovimentacao = detalheMovimentacao;
	}

}
