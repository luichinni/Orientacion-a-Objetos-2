package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente{
	private String cuit;
	
	public ClienteJuridico(String nombre, String cuit) {
		super(nombre);
		this.cuit = cuit;
	}
	static double descuentoJur = 0.15;
	@Override
	protected double getDescuento(Llamada l) {
		return l.calcularMontoLlamada() * descuentoJur;
	}
	public String getCuit() {
		return this.cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
}
