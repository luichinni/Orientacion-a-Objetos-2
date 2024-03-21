package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName= screenName;
		tweets = new LinkedList<Tweet>();
	}
	
	public Tweet twittear(String texto) {
		Tweet t= null;
		if (texto.length() >= TweetOriginal.obtenerTextoMinimo() && texto.length() <= TweetOriginal.obtenerTextoMaximo()) {
			t= new TweetOriginal(this,texto);
			tweets.add(t);
		}
		
		return t;
	}
	
	public Tweet reTwittear(Tweet tweet) {
		Tweet t= new ReTweet(this,tweet);
		tweets.add(t);
		return t;
	}
	
	public boolean eliminarTweet(Tweet tweet) {
		return tweets.remove(tweet);
	}
	
	public List<Tweet> verTweets(){
		return tweets;
	}
	
	public String obtenerNombre() {
		return screenName;
	}
}
