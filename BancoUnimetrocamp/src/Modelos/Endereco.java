package Modelos;

public class Endereco {
	private String Pais;
	private String Estado;
	private String Cidade;
	private String Bairro;
	private String Rua;
	private int Numero;
	private String CEP;
	
	public Endereco(String pais, String estado, String cidade, String bairro, String rua, int numero, String cep) {	
		Pais = pais;
		Estado = estado;
		Cidade = cidade;
		Bairro = bairro;
		Rua = rua;
		Numero = numero;
		CEP = cep;
	}
	
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
}
