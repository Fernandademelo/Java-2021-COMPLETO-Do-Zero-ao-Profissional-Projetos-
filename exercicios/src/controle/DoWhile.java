package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor"; // ele vai perguntar igualmente, o comando do acontece pelo menos uma vez
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Voc� quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
