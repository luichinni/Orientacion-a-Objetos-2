package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Publicacion> tweets;
	
	public Usuario(String nombre) {
		this.screenName = nombre;
		this.tweets = new ArrayList<Publicacion>();
	}

	public String getScreenName() {
		return screenName;
	}
	
	public Tweet twittear (String contenido) {
		if (contenido.length() < 1 || contenido.length() > 280)
			return null;
		Tweet t = new Tweet(contenido);
		this.tweets.add(t);
		return t;
	}
	
	public Retweet retwittear(Publicacion origen) {
		Retweet r = new Retweet(origen);
		this.tweets.add(r);
		return r;
	}
	
	public boolean tieneTweet(Publicacion t) {
		return this.tweets.contains(t);
	}
	
	public void eliminarTweet(Publicacion t) {
		this.tweets.remove(t);
	}
	
	public List<Publicacion> getTweets() {
		return this.tweets;
	}
}
