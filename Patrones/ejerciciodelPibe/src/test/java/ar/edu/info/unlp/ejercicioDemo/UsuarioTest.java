package ar.edu.info.unlp.ejercicioDemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario u1;
	private Usuario u2;
	
	@BeforeEach
	public void setUp() {
		this.u1 = new Usuario("Gerardo");
		this.u2 = new Usuario("Josefina");
	}
	
	@Test
	public void testTwittear() {
		assertNull(this.u1.twittear(""));
		assertNull(this.u2.twittear("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
		assertNotNull(this.u1.twittear("Holas q onda"));
		assertEquals(1, this.u1.getTweets().size());
	}
	
	@Test
	public void testRetwittear() {
		Tweet t1 = this.u1.twittear("Twitteando");
		Retweet r = this.u2.retwittear(t1);
		assertEquals(1, this.u2.getTweets().size());
		assertEquals("Twitteando", r.getContenido());
	}
	
	@Test
	public void testTieneTweet() {
		Tweet t1 = this.u1.twittear("Soy el 1");
		assertTrue(this.u1.tieneTweet(t1));
		assertFalse(this.u2.tieneTweet(t1));
	}
	
	@Test
	public void testEliminarTweet() {
		Tweet t1 = this.u2.twittear("Voy a borrar esto");
		this.u2.eliminarTweet(t1);
		assertEquals(0, this.u2.getTweets().size());
	}
}
