package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.LinkedList;
import java.util.List;

public class Twitter {
	private List<Usuario> users;
	/*
	private Tweet tweetEliminado;
	
	public Twitter(Tweet tweetEliminado) {
		users = new LinkedList<Usuario>();
		this.tweetEliminado = tweetEliminado;
	}
	*/
	public Twitter() {
		//this(new TweetOriginal(null,"Este tweet no está disponible"));
		users = new LinkedList<Usuario>();
	}
	
	public Usuario registrarUsuario(String screenName) {
		Usuario retornoU = null;
		Usuario user = obtenerUsuario(screenName);
		 if (user == null) {
			 retornoU= new Usuario(screenName);
			 users.add(retornoU);
		 }
		return retornoU;
	}
	
	public boolean eliminarUsuario(String screenName) {
		boolean pude= false;
		Usuario user= obtenerUsuario(screenName);
		if(user != null) {
			for (Tweet tweet : user.verTweets()) {
				eliminarTweet(tweet);
			}
			users.remove(user);
			pude = true;	
		}
		return pude;
		
	}
	
	public Usuario obtenerUsuario(String screenName) {
		return users.stream()
				.filter(usuario -> usuario.obtenerNombre().equals(screenName))
				.findFirst().orElse(null);
		
	}
	
	public void eliminarTweet(Tweet tweet) {
		for(Usuario usr : users) {
			for(Tweet twit : usr.verTweets()) {
				if(twit.referenciaA(tweet)) {
					eliminarTweet(twit);
					usr.eliminarTweet(twit);
				}
			}
		}
	}
}
