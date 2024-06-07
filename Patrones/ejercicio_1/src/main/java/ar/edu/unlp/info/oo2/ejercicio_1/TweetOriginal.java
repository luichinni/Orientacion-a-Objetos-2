package ar.edu.unlp.info.oo2.ejercicio_1;

public class TweetOriginal extends Tweet {
	private String texto;
	
	private static int minChar = 1;
	private static int maxChar = 280;
	
	public static int obtenerTextoMinimo() {
		return minChar;
	}
	public static int obtenerTextoMaximo() {
		return maxChar;
	}
	
	public TweetOriginal(Usuario user,String texto) {
		super(user);
		this.texto= texto;
	}

	@Override
	public String obtenerTexto() {
		return texto;
	}

	@Override
	public boolean referenciaA(Tweet tweet) {
		return false;
	}
}
