package controle;

import java.util.Scanner;

public class DesafioWhile1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total =0;
		 
		while(nota != -1) {
			System.out.println("Informe a Nota ou (-1) pra Sair: ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;		
			} else if (nota != -1) {
				System.out.println("Nota Inv�lida! ;D");
			}
			
		}
		
//		Calcular media
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);
		entrada.close();
	}
}
