package ar.edu.unlp.info.oo2.ejercicio_1;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	
public class TwitterTest {
	private Usuario user;
	private Twitter twitt;
	@BeforeEach
	void setUp() {
		twitt = new Twitter();
		user = twitt.registrarUsuario("pepe");
		
	}
	
	@Test
	public void testRegistrar() {
		assertNotNull(twitt.registrarUsuario("Luciano<3"));
		assertNull(twitt.registrarUsuario("Luciano<3"));
	}
	
	@Test
	public void testObtener() {
		assertNotNull(twitt.obtenerUsuario(user.obtenerNombre()));
		//twitt.EliminarUsuario(user.obtenerNombre());
		assertNull(twitt.obtenerUsuario("juancho pancho"));
	}
	
	
	@Test
	public void testEliminar() {
		assertTrue(twitt.eliminarUsuario(user.obtenerNombre()));
		assertFalse(twitt.eliminarUsuario(user.obtenerNombre()));
	}
	
}
