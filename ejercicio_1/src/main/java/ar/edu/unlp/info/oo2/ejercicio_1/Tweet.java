package ar.edu.unlp.info.oo2.ejercicio_1;

public abstract class Tweet {
	
	private Usuario user;
	
	public Tweet(Usuario user) {
		this.user = user;
	}
	
	public abstract String ObtenerTexto();

	public Usuario ObtenerUsuario() {
		return user;
	}
	
	public abstract boolean TieneReferencia();
}
