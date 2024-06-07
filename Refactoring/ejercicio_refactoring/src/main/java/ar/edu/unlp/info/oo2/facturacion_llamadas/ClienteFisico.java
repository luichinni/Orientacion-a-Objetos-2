package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente{
	private String dni;
	
	public ClienteFisico(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}
	static double descuentoFis = 0;
	@Override
	protected double getDescuento(Llamada l) {
		return l.calcularMontoLlamada() * descuentoFis;
	}

	public String getDNI() {
		return this.dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
}
