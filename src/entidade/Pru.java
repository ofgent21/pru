package entidade;

import java.util.Date;

public class Pru {
	private int idPru;
	private String msgPru;
	private Date dataCriacao;
	private int quantidadeLikes;
	private boolean bloqueado;

	public Pru() {
		super();
	}

	public Pru(String msgPru) {
		super();
		this.idPru = idPru+0;
		this.msgPru = msgPru;
		this.dataCriacao = new Date();
		this.quantidadeLikes = 0;
		this.bloqueado = false;
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

	@Override
	public String toString() {
		if (bloqueado) {
			return "PRU " + idPru + " BLOQUEADO POR DESCUMPRIR REGRAS DE USO";
		}
		return " Mensagem do Pru "+ idPru +": "+ msgPru + "\n Criado em: " + dataCriacao + "\n Likes:" + quantidadeLikes;
	}
}
