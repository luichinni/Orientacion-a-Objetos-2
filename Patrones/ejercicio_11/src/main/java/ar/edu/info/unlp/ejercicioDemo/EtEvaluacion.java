package ar.edu.info.unlp.ejercicioDemo;

public class EtEvaluacion extends Etapa{

	@Override
	public void aprobarEtapa(Proyecto context) {
		context.cambiarEtapa(new EtConfirmado());
	}

	@Override
	public void modifMargenGanancia(Proyecto context,double margen) {
		// Para “En evaluación” -> valores entre 11% y 15%
		if (margen > 0.11 && margen < 0.15){
			context.setMargen(margen);
		}else{
			throw new RuntimeException("Margen de ganancia debe estar entre el 11% y 15%");
		}	
	}

}
