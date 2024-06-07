package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
	public LlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		super(origen, destino, duracion);
	}
	@Override
	protected double getPrecioDuracion() {
		return this.getDuracion() * 150;
	}
	@Override
	protected double getCostoEstablecimientoDeLlamada() {
		return 50;
	}
}
