package ar.edu.unlp.info.oo2.ejercicio_1;

public class ReTweet extends Tweet {
	
	private Tweet origen ;
	
	public ReTweet(Usuario user,Tweet tweet) {
		super(user);
		this.origen = tweet;
	}

	@Override
	public String ObtenerTexto() {
		
		return origen.ObtenerTexto();
	}

	@Override
	public boolean TieneReferencia() {
		return true;
	}
	
	public Tweet ObtenerTweetOrigen() {
		return origen;
	}
	
}
