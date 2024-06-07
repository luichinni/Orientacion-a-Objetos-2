package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = new ClienteFisico("Brendan Eich", "11555666");
		sistema.registrarUsuario(emisorPersonaFisca);
		
		Cliente remitentePersonaFisica = new ClienteFisico("Doug Lea", "00000001");
		sistema.registrarUsuario(remitentePersonaFisica);
		
		Cliente emisorPersonaJuridica = new ClienteJuridico("Nvidia Corp", "17555222");
		sistema.registrarUsuario(emisorPersonaJuridica);
		
		Cliente remitentePersonaJuridica = new ClienteJuridico("Sun Microsystems", "25765432");
		sistema.registrarUsuario(remitentePersonaJuridica);
		
		Llamada llamadaN = new LlamadaNacional(emisorPersonaJuridica, remitentePersonaFisica, 10);
		this.sistema.registrarLlamada(emisorPersonaJuridica,llamadaN);
		
		Llamada llamadaI = new LlamadaInternacional(emisorPersonaJuridica,remitentePersonaFisica,8);
		this.sistema.registrarLlamada(emisorPersonaJuridica,llamadaI);
		
		llamadaN = new LlamadaNacional(emisorPersonaJuridica,remitentePersonaJuridica,5);
		this.sistema.registrarLlamada(emisorPersonaJuridica, llamadaN);
		
		llamadaI = new LlamadaInternacional(emisorPersonaJuridica,remitentePersonaJuridica, 7);
		this.sistema.registrarLlamada(emisorPersonaJuridica, llamadaI);
		
		llamadaN = new LlamadaNacional(emisorPersonaFisca,remitentePersonaFisica,15);
		this.sistema.registrarLlamada(emisorPersonaFisca, llamadaN);
		
		llamadaI = new LlamadaInternacional(emisorPersonaFisca, remitentePersonaFisica, 45);
		this.sistema.registrarLlamada(emisorPersonaFisca, llamadaI);
		
		llamadaN = new LlamadaNacional(emisorPersonaFisca, remitentePersonaJuridica, 13);
		this.sistema.registrarLlamada(emisorPersonaFisca, llamadaN);
		
		llamadaI = new LlamadaInternacional(emisorPersonaFisca, remitentePersonaJuridica, 17);
		this.sistema.registrarLlamada(emisorPersonaFisca, llamadaI);
		

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = new ClienteFisico("Alan Turing", "2444555");
		this.sistema.registrarUsuario(nuevaPersona);

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new ObtenerPrimero());
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new ObtenerAleatorio());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
