package ar.edu.unlp.info.oo2.ejercicio_1;

public class TweetOriginal extends Tweet {
	private String texto;
	
	public TweetOriginal(Usuario user,String texto) {
		super(user);
		this.texto= texto;
	}

	@Override
	public String ObtenerTexto() {
		return texto;
	}

	@Override
	public boolean TieneReferencia() {
		return false;
	}
}
