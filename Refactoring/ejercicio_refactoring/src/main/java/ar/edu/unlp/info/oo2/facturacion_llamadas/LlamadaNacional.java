package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
	public LlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		super(origen, destino, duracion);
	}
	@Override
	protected double getPrecioDuracion() {
		return this.getDuracion() * 3;
	}
	@Override
	protected double getCostoEstablecimientoDeLlamada() {
		return 0;
	}
}
