package ar.edu.info.unlp.ejercicioDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(String screenName) {
		if (existeUsuario(screenName))
			return null;
		Usuario u = new Usuario(screenName);
		this.usuarios.add(u);
		return u;
	}
	
	private boolean existeUsuario(String screenName) {
		return this.usuarios.stream().anyMatch(x -> x.getScreenName().equals(screenName));
	}
	
	public boolean eliminarUsuario(Usuario u) {
		if ( ! existeUsuario(u.getScreenName()))
			return false;
		//u.getTweets().forEach(p -> this.eliminarTweet(p));
		List<Publicacion> pp = new ArrayList<Publicacion>(u.getTweets());
		pp.forEach(p -> this.eliminarTweet(p)); // borro todos los tweets del usuario
		this.usuarios.remove(u);
		return true;
	}
	
	private void eliminarTweet(Publicacion t) {
		Usuario u = this.usuarios.stream().filter(x -> x.tieneTweet(t)).findAny().orElse(null); // me quedo con el usuario que twitteo lo que quiero borrar
		if (u != null) {
			List<Retweet> origenBorrar = this.todosRetweets().stream().filter(x -> x.esRetweetDe(t)).collect(Collectors.toList()); //me quedo con todos los retweets del tweet a borrar
			u.eliminarTweet(t); // elimino el tweet del usuario
			origenBorrar.forEach(p -> this.eliminarTweet(p)); // borro todos los retweets del tweet a borrar
		}
	}
	
	private List<Retweet> todosRetweets() {
		List<Publicacion> todas = this.usuarios.stream().flatMap(x -> x.getTweets().stream()).collect(Collectors.toList()); // me quedo con todas las publicaciones de todos los usuarios
		return todas.stream().filter(x -> x.esRetweet()).map(p -> (Retweet) p).collect(Collectors.toList()); // filtro y devuelvo solo los retweets
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
}
