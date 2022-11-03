package menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Interacao {

	//Bibliotecas
	Scanner key = new Scanner(System.in);
	SaidaDeTela tela = new SaidaDeTela();
	Random ram = new Random();

	public int numProcessos;
	private int atribuicao;
	private int tipoAlgoritimo;
	
	
	public int getNumProcessos() {
		tela.inicio();
		numProcessos = key.nextInt();
		return numProcessos;
	}
	
	public void setNumProcessos(int numProcessos) {
		this.numProcessos = numProcessos;
	}
	
	public int getAtribuicao() {
		tela.opcoes();
		atribuicao = key.nextInt();
		while ((atribuicao != 1) || (atribuicao != 2)) {
			if(atribuicao == 1) {
				//automatico
			}else if (atribuicao == 2) {
				//manual
			}
		}
		return atribuicao;
	}
	
	public void setAtribuicao(int atribuicao) {
		this.atribuicao = atribuicao;
	}
	
	public int getTipoAlgoritimo() {
		tela.tipoAlgoritimo();
		tipoAlgoritimo = key.nextInt();
		while(tipoAlgoritimo != 7) {
			switch (tipoAlgoritimo) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			case 4:
	
				break;
			case 5:
	
				break;
			case 6:
				
				break;
			default:
				tela.erro();
				tela.tipoAlgoritimo();
				tipoAlgoritimo = key.nextInt();
				break;
			}
			
		}
		return tipoAlgoritimo;
	}
	public void setTipoAlgoritimo(int tipoAlgoritimo) {
		this.tipoAlgoritimo = tipoAlgoritimo;
	}
	
	
}
