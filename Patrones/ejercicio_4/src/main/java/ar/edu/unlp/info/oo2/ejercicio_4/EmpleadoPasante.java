package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoPasante extends Empleado{
	public EmpleadoPasante(int cantHijos, boolean esCasado) {
		super(cantHijos, esCasado);
	}
	
	public void agregarCantidadExamenes(int cant) {
		this.cantExamenes += cant;
	}
	private int cantExamenes = 0;

	@Override
	protected double getBasico() {
		return 20000;
	}

	@Override
	protected double getAdicional() {
		
		return 2000 * cantExamenes;
	}
	

}
