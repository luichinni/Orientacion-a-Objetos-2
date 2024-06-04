package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoPlanta extends Empleado{
	public EmpleadoPlanta(int cantHijos, boolean esCasado) {
		super(cantHijos, esCasado);
	}
	public void envejecer(double tiempo) {
		this.antiguedad += tiempo;
	}

	private double antiguedad;
	@Override
	protected double getBasico() {
		
		return 50000;
	}

	@Override
	protected double getAdicional() {
		// TODO Auto-generated method stub
		double dinero = this.cantHijos() * 2000;
		
		if (this.esCasado() ){
			dinero += 5000;
		}
		return dinero + 2000 * antiguedad;

	}
	

}
