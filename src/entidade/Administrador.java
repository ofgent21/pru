package entidade;

public class Administrador extends Usuario {

	public static void bloquearpru(Pru atual) {
		atual.setBloqueado(true);
		};
	public static void desbloquearpru(Pru atual) {
		atual.setBloqueado(false);
	}

	@Override
	public String toString() {
		return "Administrador: " + this.getNome();
	}
}
