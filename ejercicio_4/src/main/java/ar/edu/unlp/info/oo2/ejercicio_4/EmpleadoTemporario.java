package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoTemporario extends Empleado{
	private double cantHoras;
	public EmpleadoTemporario(int cantHijos, boolean esCasado) {
		super(cantHijos, esCasado);
	}

	@Override
	protected double getBasico() {
		return (20000 + this.getHoras() * 300);
	}

	@Override
	protected double getAdicional() {
		double dinero = 0;
		if(this.esCasado()) {
			dinero= 5000;
		}
		return (dinero + this.cantHijos() * 2000);
	}
	public double getHoras() {
		return this.cantHoras;
	}
	
	public void sumarHoras(double horas) {
		this.cantHoras += horas;
	}

}
