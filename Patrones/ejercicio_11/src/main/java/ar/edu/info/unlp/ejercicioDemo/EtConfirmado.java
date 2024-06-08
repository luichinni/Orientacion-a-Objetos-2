package ar.edu.info.unlp.ejercicioDemo;

public class EtConfirmado extends Etapa{

	@Override
	public void aprobarEtapa(Proyecto context) {
		throw new RuntimeException("El proyecto ya fue confirmado");
	}

	@Override
	public void modifMargenGanancia(Proyecto context,double margen) {
		throw new RuntimeException("No se puede modificar el margen, el proyecto ya fue confirmado");
	}

}
