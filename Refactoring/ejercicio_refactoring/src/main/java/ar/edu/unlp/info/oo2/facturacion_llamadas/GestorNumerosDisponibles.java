package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private IEstrategiaGeneradora tipoGenerador = new ObtenerUltimo();

	public boolean agregarNumeroTelefono(String str) {
		boolean encontre = this.lineas.contains(str);
		if (!encontre) {
			this.lineas.add(str);
		}
		return !encontre;
	}
	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return tipoGenerador.obtenerNumeroLibre(this);
	}
	public void eliminarLinea(String linea) {
		this.lineas.remove(linea);
	}
	
	public void cambiarTipoGenerador(IEstrategiaGeneradora valor) {
		this.tipoGenerador = valor;
	}
}
