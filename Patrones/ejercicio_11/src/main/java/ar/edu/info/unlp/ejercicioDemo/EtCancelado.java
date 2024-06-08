package ar.edu.info.unlp.ejercicioDemo;

public class EtCancelado extends Etapa{

	@Override
	public void aprobarEtapa(Proyecto context) {
		throw new RuntimeException("No se pueden aprobar etapas de un proyecto cancelado");
	}

	@Override
	public void modifMargenGanancia(Proyecto context, double margen) {
		throw new RuntimeException("No se puede modificar el margen de ganancia de un proyecto cancelado");		
	}

	@Override
	public void cancelarProyecto(Proyecto context) {
		throw new RuntimeException("El proyecto ya está cancelado");
	}

}
