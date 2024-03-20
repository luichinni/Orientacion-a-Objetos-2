package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.LinkedList;
import java.util.List;

public class Twitter {
	private List<Usuario> users;
	
	public Twitter() {
		users = new LinkedList<Usuario>();
	}
	
	public Usuario RegistrarUsuario(String screenName) {
		Usuario retornoU = null;
		Usuario user = ObtenerUsuario(screenName);
		 if (user == null) {
			 retornoU= new Usuario(screenName);
			 users.add(retornoU);
		 }
		return retornoU;
	}
	
	public boolean EliminarUsuario(String screenName) {
		boolean pude= false;
		Usuario user= ObtenerUsuario(screenName);
		if(user != null) {
			for (Tweet tweet : user.VerTweets()) {
				EliminarTweet(tweet);
			}
			users.remove(user);
			pude = true;	
		}
		return pude;
		
	}
	
	public Usuario ObtenerUsuario(String screenName) {
		return users.stream()
				.filter(usuario -> usuario.obtenerNombre().equals(screenName))
				.findFirst().orElse(null);
		
	}
	
	public void EliminarTweet(Tweet tweet) {
		for(Usuario usr : users) {
			for(Tweet twit : usr.VerTweets()) {
				if(twit.TieneReferencia()) {
					ReTweet rt = (ReTweet)twit; // buscar mejor manera sin casteo igual es de juguete
					if (rt.ObtenerUsuario().obtenerNombre().equals(tweet.ObtenerUsuario().obtenerNombre())) {
						usr.EliminarTweet(twit);
					}
				}
			}
		}
	}
}
