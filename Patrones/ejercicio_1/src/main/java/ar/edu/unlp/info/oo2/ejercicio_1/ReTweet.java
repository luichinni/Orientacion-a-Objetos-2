package ar.edu.unlp.info.oo2.ejercicio_1;

public class ReTweet extends Tweet {
	
	private Tweet origen ;
	
	public ReTweet(Usuario user,Tweet tweet) {
		super(user);
		this.origen = tweet;
	}

	@Override
	public String obtenerTexto() {
		
		return origen.obtenerTexto();
	}

	@Override
	public boolean referenciaA(Tweet tweet) {
		return tweet.equals(origen);
	}
	
	public Tweet obtenerTweetOrigen() {
		return origen;
	}
	
}
