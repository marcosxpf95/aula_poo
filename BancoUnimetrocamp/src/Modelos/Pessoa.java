package Modelos;

public class Pessoa {
	private String Nome;
	private String CPF;
	private String Telefone;
	private Endereco Endereco;
	private String Email;

	public Pessoa(String nome, String cpf, String telefone, Endereco endereco, String email) {
		if (nome != "") {
			Nome = nome;
		}
		if (CPF != "") {
			CPF = cpf;
		}
		if (telefone != "") {
			Telefone = telefone;
		}
		if (email != "") {
			Email = email;
		}
		if (endereco != null) {
			Endereco = endereco;
		}
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
