package ar.edu.unlp.info.oo2.ejercicio_1;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	
public class UsuarioTest {
	private Usuario user;
	private Tweet tweet;
	
	@BeforeEach
	void setUp() {
		user = new Usuario("pepo");
		tweet= user.twittear("pepepepep");
	}
	
	@Test
	public void testTwittearMaxChar() {//separar las particiones
		String text = "a";
		for(int i=0; i<280; i++) {
			text = text+"a";
		}
		
		assertNull(user.twittear(text));
	}
	@Test
	public void testTwittearMinChar() {
		assertNull(user.twittear(""));
	}
	@Test
	public void testTwittearNormal() {
		String text = "";
		for(int i=0; i<280; i++) {
			text = text+"a";
		}
		assertNotNull(user.twittear("1"));
		assertNotNull(user.twittear(text));
	}
	
	@Test
	public void testEliminar() {
		assertTrue(user.eliminarTweet(tweet));
		assertFalse(user.eliminarTweet(tweet));
	}
}
