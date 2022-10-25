package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		SaidaDeTela tela = new SaidaDeTela();
		TempoDeExecucao temp =  new TempoDeExecucao();
		
		
		tela.inicio();
		temp.getTam(key);
		temp.temp();
	}

}
