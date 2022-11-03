package menu;

public class SaidaDeTela {
	
	public void inicio() {
		System.out.print("Digite o numero de processos: ");
		
	}
	public void opcoes() {
		System.out.println("\n----- Opções ----- "
				+ "\n1) Atribuição Automática"
				+ "\n2) Atribuição Manual");
		System.out.print("\nOPÇÃO: "); 
	}
	
	public void tipoAlgoritimo() {
		System.out.print("\n***** ESCOLHA O TIPO DE ALGORITMO *****"
				+ "\n             1) FCFS"
				+ "\n             2) SJF"
				+ "\n             3) SJF P"
				+ "\n             4) ROBIN"
				+ "\n             5) PRIORIDADE"
				+ "\n             6) PRIORIDADE P"
				+ "\n             7) SAIR\n"
				+ "\nOPÇÃO: ");
	}
	public void erro() {
		System.out.println("\nOPÇÃO INVALIDA! "
				+ "\nPOR FAVOR USAR UMA DAS OPÇÕES DISPONIVEIS");
	}
	

}
