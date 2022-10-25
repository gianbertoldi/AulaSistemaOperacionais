package menu;

import java.util.Scanner;

public class TempoDeExecucao {
	Scanner key = new Scanner(System.in);
	SaidaDeTela tela = new SaidaDeTela();
	
	public int tam;

	public int getTam(Scanner key) {
		tam = key.nextInt();
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
	public int temp() {
		int tempo[] =  new int[tam];
		int p = 0;
		for (int i = 0; i < tempo.length; i++) {			
			p++;
			System.out.println(i + " : p" + p);
		}
		return tempo[tam];
	}
}
