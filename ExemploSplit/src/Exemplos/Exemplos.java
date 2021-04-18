package Exemplos;

public class Exemplos {

	public static void main(String[] args) {
		String texto = "MARCELLA|4598738274|1998748372|BRASIL|SP|PAULINIA|13902|VIVIANE|141|139019|marcella.muller@hotmail.com|144093|17-37-2021|c|1000.0|1000.0|13190|110|10000.0|";
		
		String[] textoSeparado = texto.split("[|]");

		for(String itens : textoSeparado) {
			System.out.println(itens);
		}
	}

}
