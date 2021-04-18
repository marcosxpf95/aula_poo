package Modelos;

public class Usuario {
	private Cliente cliente;
	private String senha;

	public Usuario(Cliente cliente, String senha) {
		this.cliente = cliente;
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
