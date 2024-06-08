package ar.edu.info.unlp.ejercicioDemo;

public abstract class Etapa {

	public double getCosto(Proyecto context){
		return context.getCosto();
	}

	public double getPrecio(Proyecto context){
		return context.getPrecio();
	}

	public abstract void aprobarEtapa(Proyecto context);
	public abstract void modifMargenGanancia(Proyecto context, double margen);
	
	public void cancelarProyecto(Proyecto context){
		context.cambiarEtapa(new EtCancelado());
	}
	
}
