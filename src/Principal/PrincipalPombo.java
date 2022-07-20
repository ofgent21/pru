package Principal;

import entidade.Pru;
import entidade.Usuario;

public class PrincipalPombo {
		
	
	
	
	public static final int MAXIMO_CARACTERES = 300;
	public static final int MINIMO_CARACTERES = 1;

	public static void main(String[] args) {
	
		
		
		
		
		int sai = 0;
		int vez = 0;
		while (sai < 1) {
			vez++;
			String textoPru = "";
			if (vez == 1) {
				textoPru = "Este é o meu primeiro PRU, construído para exemplo";

			} else if (vez == 2) {
				textoPru = "Este é o meu segundo PRU, construído para exemplo";
				sai = 1;
			}

			textoPru = textoPru.trim();

			int quantidadeCaracteresNome = textoPru.length();
			if (quantidadeCaracteresNome < MINIMO_CARACTERES || quantidadeCaracteresNome > MAXIMO_CARACTERES) {
				System.out.println("O pru precisa ter no mínimo " + MINIMO_CARACTERES + " caractere ou no máximo "
						+ MAXIMO_CARACTERES + " caracteres");
				System.out.println(quantidadeCaracteresNome);
			} else {
			}

			Pru textoPru2 = new Pru(textoPru);

			System.out.println(textoPru2);
			
			

		} // fim do while principal
	}

}
