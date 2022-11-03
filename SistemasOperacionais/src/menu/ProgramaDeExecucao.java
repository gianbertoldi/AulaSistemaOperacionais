package menu;

import java.util.Scanner;

public class ProgramaDeExecucao{

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Interacao selecao = new Interacao();
		
		selecao.getNumProcessos();
		selecao.getAtribuicao();
		selecao.getTipoAlgoritimo();
	}

}
