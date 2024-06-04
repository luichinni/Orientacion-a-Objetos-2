package ar.edu.unlp.info.oo2.ejercicio_4;

public abstract class Empleado {
	
	private int cantHijos;
	private boolean esCasado;

	public Empleado(int cantHijos,boolean esCasado) {
		this.cantHijos = cantHijos;
		this.esCasado = esCasado;
	}
	
	
	
	public double Sueldo() {
		return (this.getBasico() + this.getAdicional() + this.getDescuento());
	}
	
	protected abstract double getBasico();
	protected abstract double getAdicional();
	protected double getDescuento() {
		return (this.getBasico() * 0.13 + this.getAdicional() * 0.05);
	}
	
	public boolean esCasado() {
		return this.esCasado;
	}
	
	public int cantHijos() {
		return this.cantHijos;
	}
}
