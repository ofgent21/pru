package Principal;

import java.util.ArrayList;
import entidade.Administrador;
import entidade.Pru;
import entidade.Pru.FormataData;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
		te0.te1();
		System.out.println("----------------------------------- Portal de Pruus ------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------    " + FormataData.data());
		System.out.println("----------------------------------------------------------------------------------");

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		ArrayList<Pru> pruUsuario1 = new ArrayList<Pru>();
		Usuario usuario01 = new Usuario(1, "Usuario 01", "email01@email.com.br", "123.456.789-01", pruUsuario1);
		ArrayList<Pru> pruUsuario2 = new ArrayList<Pru>();
		Usuario usuario02 = new Usuario(2, "Usuario 02", "email02@email.com.br", "123.456.789-02", pruUsuario2);
		ArrayList<Pru> pruUsuario3 = new ArrayList<Pru>();
		Usuario usuario03 = new Usuario(3, "Usuario 03", "email03@email.com.br", "123.456.789-03", pruUsuario3);

		usuarios.add(usuario01);
		usuarios.add(usuario02);
		usuarios.add(usuario03);
		ArrayList<Pru> prus = new ArrayList<Pru>();
		int codIdPru = 0;

		String msgPru1 = "Primeiro pru... olá boa tarde";
		msgPru1 = VerificaMensagem.mensagem(msgPru1);
		if (msgPru1 == "") {
		} else {

			codIdPru++;
			Pru pru1 = new Pru(usuarios.get(0).getNome() + " > " + msgPru1);
			prus.add(pru1);
			pru1.setIdPru(codIdPru);
			pruUsuario1.add(pru1);
		}

		String msgPru2 = "Verificando de novo o pru";
		msgPru2 = VerificaMensagem.mensagem(msgPru2);
		if (msgPru2 == "") {
		} else {

			codIdPru++;
			Pru pru2 = new Pru(usuarios.get(1).getNome() + " > " + msgPru2);
			prus.add(pru2);
			pru2.setIdPru(codIdPru);
			pruUsuario2.add(pru2);
		}

		String msgPru3 = "Olá, aqui é mais uma mensagem. Boa Noite, ou melhor boa tarde, rsrs ";
		msgPru3 = VerificaMensagem.mensagem(msgPru3);
		if (msgPru3 == "") {
		} else {

			codIdPru++;
			Pru pru3 = new Pru(usuarios.get(2).getNome() + " > " + msgPru3);
			prus.add(pru3);
			pru3.setIdPru(codIdPru);

			pruUsuario3.add(pru3);
		}

		String msgPru4 = "Olá, de novo estou aqui para mais uma mensagem. Boa Noite. ";
		msgPru4 = VerificaMensagem.mensagem(msgPru4);
		if (msgPru4 == "") {
		} else {

			codIdPru++;
			Pru pru4 = new Pru(usuarios.get(2).getNome() + " > " + msgPru4);
			prus.add(pru4);
			pru4.setIdPru(codIdPru);
			pruUsuario3.add(pru4);
		}

		String msgPru5 = "Que este final de semana todos sejam felizes.... kk ";
		msgPru5 = VerificaMensagem.mensagem(msgPru5);
		if (msgPru5 == "") {
		} else {

			codIdPru++;
			Pru pru5 = new Pru(usuarios.get(0).getNome() + " > " + msgPru5);
			prus.add(pru5);
			pru5.setIdPru(codIdPru);
			pruUsuario1.add(pru5);
		}

		String msgPru6 = "E aí pessoa, prontos pros novos desafios..... contem comigo";
		msgPru6 = VerificaMensagem.mensagem(msgPru6);
		if (msgPru6 == "") {
		} else {

			codIdPru++;
			Pru pru6 = new Pru(usuarios.get(1).getNome() + " > " + msgPru6);
			prus.add(pru6);
			pru6.setIdPru(codIdPru);
			pruUsuario2.add(pru6);
		}

		// *******************************************************************************************************************
		int codLike = 3;
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codLike) {
				prus.get(i).setQuantidadeLikes(prus.get(i).getQuantidadeLikes() + 1);
			}
		}

		codLike = 4;
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codLike) {
				prus.get(i).setQuantidadeLikes(prus.get(i).getQuantidadeLikes() + 1);
			}
		}

		codLike = 1;
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codLike) {
				prus.get(i).setQuantidadeLikes(prus.get(i).getQuantidadeLikes() + 1);
			}
		}

		codLike = 4;
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codLike) {
				prus.get(i).setQuantidadeLikes(prus.get(i).getQuantidadeLikes() + 1);
			}
		}
		
		
		codLike = 5;
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codLike) {
				prus.get(i).setQuantidadeLikes(prus.get(i).getQuantidadeLikes() + 1);
			}
		}
		
		// ******** BLOQUEIO  PRUS ************************************************************************************
		
		int codBlock = 5;
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codBlock) {
				Administrador.bloquearpru(prus.get(i));
			}
		}
		
		
		
		//********************************************************************************************************************
		
		

		System.out.println("TODOS OS PRUUS.........................................................");
		for (int i = 0; i < prus.size(); i++) {
			System.out.println(prus.get(i));
			te0.te1();
		}
		System.out.println("FIM DE TODOS OS PRUUS........................................................");

		System.out.println("");
		System.out.println("");
		System.out.println("TODOS OS PRUS POR USUARIO");
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i));
			te0.te1();
		}

	}

}

class VerificaMensagem {
	public static final int MAXIMO_CARACTERES = 300;
	public static final int MINIMO_CARACTERES = 1;

	public static String mensagem(String textoPru) {
		textoPru = textoPru.trim();
		int quantidadeCaracteresNome = textoPru.length();
		if (quantidadeCaracteresNome < MINIMO_CARACTERES || quantidadeCaracteresNome > MAXIMO_CARACTERES) {
			System.out.println("O pru precisa ter no mínimo " + MINIMO_CARACTERES + " caractere ou no máximo "
					+ MAXIMO_CARACTERES + " caracteres");
			return "";
		} else {
		}
		return textoPru;
	}
}

class te0 {
	public static void te1() {
		System.out.println("(º)< (º)> ............................................. (º)< (º)>  ");
	}
}