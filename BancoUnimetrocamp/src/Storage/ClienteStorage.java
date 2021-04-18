package Storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Modelos.Cartao;
import Modelos.Cliente;
import Modelos.Conta;
import Modelos.Endereco;

public class ClienteStorage {
	private File storage;
	
	public ClienteStorage() {
		storage = new File("clienteStorage.txt");
	}
	
	public void Gravar(Cliente cliente) {
		Endereco endereco = cliente.getEndereco();
		Conta conta = cliente.getConta();
		Cartao cartao = cliente.getCartoes();
	    DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		try (PrintWriter pw = new PrintWriter(this.storage) ){
			pw.append(converterTextoGravar(cliente.getNome())+"|");
			pw.append(converterTextoGravar(cliente.getCPF())+"|");
			pw.append(converterTextoGravar(cliente.getTelefone())+"|");
			pw.append(converterTextoGravar(endereco.getPais())+"|");
			pw.append(converterTextoGravar(endereco.getEstado())+"|");
			pw.append(converterTextoGravar(endereco.getCidade())+"|");
			pw.append(converterTextoGravar(endereco.getBairro())+"|");
			pw.append(converterTextoGravar(endereco.getRua())+"|");
			pw.append(converterTextoGravar(Integer.toString(endereco.getNumero()))+"|");
			pw.append(converterTextoGravar(endereco.getCEP())+"|");
			pw.append(converterTextoGravar(cliente.getEmail())+"|");
			pw.append(converterTextoGravar(Integer.toString(cliente.getAgencia()))+"|");
			pw.append(converterTextoGravar(dateFormat.format(conta.getDataCriacao()))+"|");
			pw.append(converterTextoGravar(conta.getTipo())+"|");
			pw.append(converterTextoGravar(String.valueOf(conta.getSaldo()))+"|");
			pw.append(converterTextoGravar(String.valueOf(conta.getChequeEspecial()))+"|");
			pw.append(converterTextoGravar(cartao.getNumero())+"|");
			pw.append(converterTextoGravar(Integer.toString(cartao.getCDV()))+"|");
			pw.append(converterTextoGravar(String.valueOf(cartao.getLimite()))+"|");
			pw.flush();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public String[] Ler() {
		
		try( InputStream in = new FileInputStream(this.storage) ){
			  Scanner scan = new Scanner(in);
			  String retornoArquivo = "";
			  while( scan.hasNext() ){
			    retornoArquivo = scan.nextLine();
			  }
			  String[] cliente = retornoArquivo.split("[|]");
			  scan.close();
			  
			  return cliente;
			}catch(IOException ex){
			  ex.printStackTrace();
			} 
		return null;
	}
	
	public String converterTextoGravar(String texto) {
		
		return texto;
	}
	
	public Cliente getClienteStoraged() {
		
		try {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
			String[] dadosCliente = Ler();
			
			Endereco endereco = new Endereco(
					dadosCliente[3],
					dadosCliente[4],
					dadosCliente[5],
					dadosCliente[6],
					dadosCliente[7],
					Integer.parseInt(dadosCliente[8]),
					dadosCliente[9]
					);
			
			Conta conta = new Conta(
					formato.parse(dadosCliente[12]),
					dadosCliente[13],
					Double.parseDouble(dadosCliente[14]),
					Double.parseDouble(dadosCliente[15])
					);
					
			Cartao cartao = new Cartao(
					dadosCliente[16],
					Integer.parseInt(dadosCliente[17]),
					Double.parseDouble(dadosCliente[18])
					);
					
			
			Cliente cliente = new Cliente(
					dadosCliente[0],
					dadosCliente[1],
					dadosCliente[2],
					endereco,
					dadosCliente[10],
					Integer.parseInt(dadosCliente[11]),
					conta,
					cartao
					);
			
			return cliente;
		}catch(Exception ex) {
			System.out.println("Error: " + ex);
		}
		
		return null;
	}
}
