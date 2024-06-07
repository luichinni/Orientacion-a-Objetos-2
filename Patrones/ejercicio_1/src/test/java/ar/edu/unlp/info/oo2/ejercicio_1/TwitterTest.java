package ar.edu.unlp.info.oo2.ejercicio_1;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	
public class TwitterTest {
	private Twitter twitt;
	@BeforeEach
	void setUp() {
		twitt = new Twitter();
	}
	
	@Test
	public void testEliminarUsuario() {
		Usuario user = twitt.registrarUsuario("pepe");
		assertTrue(twitt.eliminarUsuario(user.obtenerNombre()));
	}
	
	@Test
	public void testEliminarNoExistente() {
		assertFalse(twitt.eliminarUsuario("pepe"));
	}
	
	@Test
	public void testRegistrar() {
		assertNotNull(twitt.registrarUsuario("Luciano<3"));
	}
	@Test
	public void testRegistrarYaExistente() {
		assertNotNull(twitt.registrarUsuario("Luciano<3"));
		assertNull(twitt.registrarUsuario("Luciano<3"));
	}
	
	@Test
	public void testObtener() {
		Usuario user = twitt.registrarUsuario("pepe");
		assertNotNull(twitt.obtenerUsuario(user.obtenerNombre()));
	}
	@Test
	public void testObtenerNoExiste() {
		assertNull(twitt.obtenerUsuario("juancho pancho"));
	}
	@Test
	public void testObtenerEliminado() {
		Usuario user = twitt.registrarUsuario("pepe");
		twitt.eliminarUsuario(user.obtenerNombre());
		assertNull(twitt.obtenerUsuario(user.obtenerNombre()));
	}
	@Test
	public void testEliminar() {
		Usuario user = twitt.registrarUsuario("pepe");
		assertTrue(twitt.eliminarUsuario(user.obtenerNombre()));
		assertFalse(twitt.eliminarUsuario(user.obtenerNombre()));
	}
	@Test
	public void testEliminarConTweets() {
		Usuario user = twitt.registrarUsuario("pepe");
		Tweet tw1 = user.twittear("Hey there! Im using Twitter");
		
		twitt.eliminarUsuario(user.obtenerNombre());
		
		assertFalse(user.verTweets().contains(tw1));
		assertNull(twitt.obtenerUsuario(user.obtenerNombre()));
	}
	@Test
	public void testEliminarCadenaDeRT() {
		Usuario user = twitt.registrarUsuario("pepe");
		Tweet tw1 = user.twittear("Hey there! Im using Twitter");
		Tweet rt1 = user.reTwittear(tw1);
		user.reTwittear(rt1);
		
		twitt.eliminarUsuario(user.obtenerNombre());
		
		assertTrue(user.verTweets().size() == 0);
		assertNull(twitt.obtenerUsuario(user.obtenerNombre()));
	}
	
}
