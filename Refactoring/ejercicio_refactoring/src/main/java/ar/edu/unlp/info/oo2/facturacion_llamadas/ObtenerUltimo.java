package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ObtenerUltimo implements IEstrategiaGeneradora{
	public String obtenerNumeroLibre(GestorNumerosDisponibles gestor) {
		String linea = gestor.getLineas().last();
		gestor.eliminarLinea(linea);
		return linea;
	}
}
