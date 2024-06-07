package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;

public class ObtenerAleatorio implements IEstrategiaGeneradora{
	public String obtenerNumeroLibre(GestorNumerosDisponibles gestor) {
		String linea = new ArrayList<String>(gestor.getLineas())
				.get(new Random().nextInt(gestor.getLineas().size()));
		gestor.eliminarLinea(linea);
		return linea;
	}
}
