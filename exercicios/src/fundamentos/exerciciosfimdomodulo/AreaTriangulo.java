package fundamentos.exerciciosfimdomodulo;

import java.util.Scanner;

public class AreaTriangulo {
public static void main(String[] args) {
	//Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Qual o valor da base? ");
	int base = entrada.nextInt();
	
	System.out.println("Qual o valor da altura? ");
	int altura = entrada.nextInt();
	
	int area = ( base * altura ) / 2 ;
	
	System.out.println(" �rea do Triangulo = " + area);
	
	
	
	entrada.close();
}
}
