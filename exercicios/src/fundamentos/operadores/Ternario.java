package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.0;
		String resultadoParcial = media >= 5.0 ? "em Recupera��o " : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado." : " em Recupera��o." ;
		
		System.out.println("O Aluno est�: " + resultadoParcial);
	}

}
