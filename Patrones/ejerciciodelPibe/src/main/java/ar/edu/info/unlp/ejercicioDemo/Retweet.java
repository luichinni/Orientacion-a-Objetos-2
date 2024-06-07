package ar.edu.info.unlp.ejercicioDemo;

public class Retweet implements Publicacion{
	private Publicacion origen;
	
	public Retweet(Publicacion origen) {
		this.origen = origen;
	}

	public String getContenido() {
		return this.origen.getContenido();
	}

	public boolean esRetweet() {
		return true;
	}
	
	public boolean esRetweetDe(Publicacion t) {
		return this.origen == t; 
	}
}
