package ar.edu.unlp.info.oo2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
	
	private EmpleadoTemporario empleadoSolo;
	private EmpleadoTemporario empleadoCasado;
	private EmpleadoTemporario empleadoConHijos;
	private EmpleadoTemporario empleadoCasadoConHijos;
	@BeforeEach
	void EmpleTempTestSetup() {
		empleadoSolo = new EmpleadoTemporario(0, false);
		empleadoCasado = new EmpleadoTemporario(0, true);
		empleadoConHijos = new EmpleadoTemporario(3, false);
		empleadoCasadoConHijos = new EmpleadoTemporario(4, true);
	}
	
	@Test
	public void SueldoCasadoConHijosTest() {
		assertEquals(22600, empleadoSolo.Sueldo(),0.1);
		assertEquals(27850, empleadoCasado.Sueldo(),0.1);
		assertEquals(28900, empleadoConHijos.Sueldo(),0.1);
		assertEquals(36250, empleadoCasadoConHijos.Sueldo(),0.1);
	}
	
	@Test
	public void SueldoHorasTest() {
		empleadoSolo.sumarHoras(10);
		empleadoCasado.sumarHoras(10);
		empleadoConHijos.sumarHoras(10);
		empleadoCasadoConHijos.sumarHoras(10);

		assertEquals(25990, empleadoSolo.Sueldo(),0.1);
		assertEquals(31240, empleadoCasado.Sueldo(),0.1);
		assertEquals(32290, empleadoConHijos.Sueldo(),0.1);
		assertEquals(39640, empleadoCasadoConHijos.Sueldo(),0.1);
	}
}
