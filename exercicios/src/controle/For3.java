package controle;

public class For3 {

	public static void main(String[] args) {
		
		
//		int i = 0; // colocar fora do la�o para poder acesar a var
//		for(; i < 10; i++) { // tirar a declaracao de dentro, senao s� vai ate 9
//			System.out.println(i);
//		}
//		
//		System.out.println("Fora do la�o:");
//		System.out.println(i);
		
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j <10; j++) {
				System.out.printf("[%d %d]\n", i, j); 
			}
		}
	}

}
