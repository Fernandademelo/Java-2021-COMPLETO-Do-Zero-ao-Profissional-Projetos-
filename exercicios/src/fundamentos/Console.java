package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n"); // o \n pula linha, quebra de linha
		
		System.out.println("BOM");
		System.out.println("DIA!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n" , 1, 2, 3, 4, 5, 6); //caracteres especiais para logo depois da virgula subtituir o texto formatdado.
		System.out.printf("Salario: %.1f %n", 1234.6789);
		System.out.printf("Nome: %s %n", "Fernandinha");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um animal: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua cor: ");
		String nome2 = entrada.nextLine();
		
		System.out.print("Digite seu genero: ");
		String genero = entrada.nextLine();
		
		System.out.print("sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Sua escolha foi: %s da cor: %s do genero: %s, e a sua idade atual ? de : %d",
				nome, nome2, genero, idade);
				
				
		
		entrada.close(); //fechar o scanner, xq ocupa recursos da maquina
	}
}
