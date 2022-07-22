package entidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pru {
	private int idPru;
	private String msgPru;
	private String dataCriacao;
	private int quantidadeLikes;
	private boolean bloqueado;
	private int idUsu;

	public Pru() {
		super();
	}

	public Pru(String msgPru) {
		super();
		this.idPru = idPru + 0;
		this.msgPru = msgPru;
		this.dataCriacao = FormataData.data();
		this.quantidadeLikes = 0;
		this.bloqueado = false;
		this.idUsu = idUsu + 0;
	}

	public int getIdPru() {
		return idPru;
	}

	public void setIdPru(int IdPru) {
		this.idPru = IdPru;
	}

	public String getMsgPru() {
		return msgPru;
	}

	public void setMsgPru(String msgPru) {
		this.msgPru = msgPru;
	}

	public int getQuantidadeLikes() {
		return quantidadeLikes;
	}

	public void setQuantidadeLikes(int quantidadeLikes) {
		this.quantidadeLikes = quantidadeLikes;
	}

	public boolean isBloqueado() {
		if (bloqueado == true) {
			return bloqueado = false;
		} else {
			return bloqueado = true;
		}
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public void somaLikes() {
		this.quantidadeLikes++;
	}

	public int getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	public class FormataData {
		public static String data() {
			Date datainicial = new Date();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:MM:S");
			String datacriacao = dateFormat.format(datainicial);
			return datacriacao;
		}

	}

	@Override
	public String toString() {
		if (bloqueado) {
			return "\nPRU " + idPru + " BLOQUEADO POR DESCUMPRIR REGRAS DE USO";
		}
		return "Pru " + idPru + ": " + msgPru + "\n Criado em: " + dataCriacao + "\n Likes:"
				+ quantidadeLikes +"\n";
	}
}
