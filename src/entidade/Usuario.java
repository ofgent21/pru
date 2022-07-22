package entidade;

import java.util.ArrayList;

public class Usuario {
	private int idUsuario;
	private String nome;
	private String email;
	private String cpf;
	private ArrayList<Pru> prus;
	
	public Usuario() {
		super();
	}
	
	public Usuario(int idUsuario, String nome, String email, String cpf, ArrayList<Pru> prus) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.prus = prus;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Pru> getPrus() {
		return prus;
	}

	public void setPrus(ArrayList<Pru> prus) {
		this.prus = prus;
	}

	public void criarMensagem(String msg) {
		Pru novo = new Pru(msg);

		this.prus.add(novo);
	}
	
	public int idSoma( ) {
		return this.getIdUsuario()+1;
	}

	@Override
	public String toString() {
		return " Usuario:" + idUsuario + "\n Nome:" + nome + "\n email=" + email + "\n CPF=" + cpf + "\n PRUS USUARIO: \n"
				+ prus;
	}
 
}
