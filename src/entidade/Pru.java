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
		this.idPru = contaId();
		this.msgPru = msgPru;
		this.dataCriacao = new Date();
		this.quantidadeLikes = 0;
		this.bloqueado = false;
	}

	public int somaLike() {
		return this.getQuantidadeLikes()+1;
	}
	
	public int contaId() {
		return this.getIdPru()+1;  
	}

	public int getIdPru() {
	return idPru;
		
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
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	@Override
	public String toString() {
		return "Pru idPru =" + idPru + "\n" + msgPru + "\n Criado em: " + dataCriacao + "\n Likes:"
				+ quantidadeLikes + "\n bloqueado=" + bloqueado;
	}

}
