package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ObtenerPrimero implements IEstrategiaGeneradora {
	public String obtenerNumeroLibre(GestorNumerosDisponibles gestor) {
		String linea = gestor.getLineas().first();
		gestor.eliminarLinea(linea);
		return linea;
	}
}
