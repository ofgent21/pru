package Principal;

import java.util.ArrayList;

import entidade.Administrador;
import entidade.Pru;
import entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
	ArrayList<Usuario> uListaUm = new ArrayList<Usuario>();
	ArrayList<Usuario> uListaDois = new ArrayList<Usuario>();
	ArrayList<Usuario> uListaTres = new ArrayList<Usuario>();
	
	Usuario usuario01 = new Usuario(1,"Usuario 01","email01@email.com.br","123.456.789-01",null);
	Usuario usuario02 = new Usuario(2,"Usuario 02","email02@email.com.br","123.456.789-02",null);
	Usuario usuario03 = new Usuario(3,"Usuario 03","email03@email.com.br","123.456.789-03",null);
	uListaUm.add(usuario01);
	uListaDois.add(usuario02);
	uListaTres.add(usuario03);
	
	System.out.println(usuario01);
	System.out.println(uListaUm);
	System.out.println(usuario02);
	System.out.println(usuario03);
	
	ArrayList<Pru> prus = new ArrayList<Pru>();
	Pru pru1 = new Pru(uListaUm.get(0) + " olá");
	prus.add(pru1);
	Administrador.bloquearpru(pru1);
	
	Pru pru2 = new Pru(uListaUm.get(0) + "mais um pru");
	prus.add(pru2);
	for (int i = 0;i<prus.size();i++) {
	System.out.println(prus.get(i));
	System.out.println("============================");
	}
	
	

	}

}
