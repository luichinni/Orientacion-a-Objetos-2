package ar.edu.info.unlp.ejercicioDemo;

public class EtConstruccion extends Etapa{

	@Override
	public void aprobarEtapa(Proyecto context) {
		if (context.getPrecio() != 0) {
			context.cambiarEtapa(new EtEvaluacion());
		}else{
			throw new RuntimeException("El precio del proyecto debe ser mas de 0");
		}
		
	}

	@Override
	public void modifMargenGanancia(Proyecto context,double margen) {
		// Para “En construcción” -> valores entre 8% y 10%
		if (margen > 0.08 && margen < 0.10){
			context.setMargen(margen);
		}else{
			throw new RuntimeException("Margen de ganancia debe estar entre el 8% y 10%");
		}
	}

}
