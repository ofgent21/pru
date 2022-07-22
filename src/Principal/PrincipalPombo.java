package Principal;

import java.util.ArrayList;
import java.util.Date;

import entidade.Administrador;
import entidade.Pru;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario01 = new Usuario(1, "Usuario 01", "email01@email.com.br", "123.456.789-01", null);
		Usuario usuario02 = new Usuario(2, "Usuario 02", "email02@email.com.br", "123.456.789-02", null);
		Usuario usuario03 = new Usuario(3, "Usuario 03", "email03@email.com.br", "123.456.789-03", null);

		usuarios.add(usuario01);
		usuarios.add(usuario02);
		usuarios.add(usuario03);

		ArrayList<Pru> prus = new ArrayList<Pru>();
		int codIdPru = 0;
		
		
		System.out.println(prus);
		// System.out.println("----------------------------------------");
		// System.out.println("PRIMEIRO PRU");
		// System.out.println("----------------------------------------");
		String msgPru1 = "Verificando de novo o pru";
		msgPru1 = VerificaMensagem.mensagem(msgPru1);
		if (msgPru1 == "") {
		} else {
			codIdPru++;
			Pru pru1 = new Pru(msgPru1);
			prus.add(pru1);
			pru1.setIdPru(codIdPru);
			usuario02.setPrus(prus);
		}

		// System.out.println("----------------------------------------");
		// System.out.println("SEGUNDO PRU");
		// System.out.println("----------------------------------------");
		String msgPru2 = "Verificando de novo o pru";
		msgPru2 = VerificaMensagem.mensagem(msgPru2);
		if (msgPru2 == "") {
		} else {
			codIdPru++;
			Pru pru2 = new Pru(msgPru2);
			prus.add(pru2);
			pru2.setIdPru(codIdPru);
			usuario02.setPrus(prus);
		}

		// System.out.println("----------------------------------------");
		// System.out.println("TERCEIRO PRU");
		// System.out.println("----------------------------------------");
		String msgPru3 = "Olá, aqui é mais uma mensagem. Boa Noite. ";
		msgPru3 = VerificaMensagem.mensagem(msgPru3);
		if (msgPru3 == "") {
		} else {
			codIdPru++;
			Pru pru3 = new Pru(msgPru3);
			prus.add(pru3);
			pru3.setIdPru(codIdPru);
			usuario03.setPrus(prus);

		}

		// BLOQUEAR PRU ATUAL
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codIdPru) {
				Administrador.bloquearpru(prus.get(i));
			}
		}
		// APRESENTA O PRU BLOQUEADO
		System.out.println("PRU BLOQUEADO");
		System.out.println(usuario03);

		// DESBLOQUEAR PRU ATUAL
		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codIdPru) {
				Administrador.desbloquearpru(prus.get(i));
			}
		}

		// APRESENTA O PRU DESBLOQUEADO
		System.out.println("PRU DESBLOQUEADO");
		System.out.println(usuario03);

		// System.out.println("----------------------------------------");
		// System.out.println("QUARTO PRU");
		// System.out.println("----------------------------------------");
		String msgPru4 = "Olá, de novo estou aqui para mais uma mensagem. Boa Noite. ";
		msgPru4 = VerificaMensagem.mensagem(msgPru4);
		if (msgPru4 == "") {
		} else {
			codIdPru++;
			Pru pru4 = new Pru(msgPru4);
			prus.add(pru4);
			pru4.setIdPru(codIdPru);
			usuario03.setPrus(prus);
		}

		for (int i = 0; i < prus.size(); i++) {
			if (prus.get(i).getIdPru() == codIdPru) {
				prus.get(i).setQuantidadeLikes(prus.get(i).getQuantidadeLikes() + 1);
			}
		}

		for (int i = 0; i < prus.size(); i++) {
			System.out.println(prus.get(i));
			System.out.println("============================");
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
