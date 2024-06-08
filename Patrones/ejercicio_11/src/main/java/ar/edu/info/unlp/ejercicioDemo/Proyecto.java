package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class Proyecto {
	private String nombre;
	private LocalDate feChaI;
	private LocalDate fechaF;
	private double margenG;
	private String objetivo;
	private int integrantes;
	private double montoPorDia;
	private Etapa etapa;
	
	public Proyecto(String nombre, LocalDate fechaI,LocalDate fechaF,String objetivo,int integrantes, double montoDia)
	{
		this.nombre = nombre;
		this.etapa = new EtConstruccion();
		this.fechaF= fechaF;
		this.feChaI = fechaI;
		this.integrantes= integrantes;
		this.margenG = 0.07;
		this.objetivo = objetivo; 
		this.montoPorDia = montoDia;
	}
	
	public double getCosto() { 
		// tuve q poner atStartOfDay() ya que Duration.between pide un temporal q soporte segundos y cosas asi, cosa que con localdate pelado no pasa.
		return this.integrantes * this.montoPorDia * Duration.between(this.feChaI.atStartOfDay(),this.fechaF.atStartOfDay()).toDays();
	}
	
	public double getPrecio() {
		return this.getCosto() + this.getCosto() * this.margenG;
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	public void modifMargenGanancia (double margen) {
		this.etapa.modifMargenGanancia(this,margen);
	}
	
	public void setMargen(double margen){
		this.margenG = margen;
	}

	public void cambiarEtapa(Etapa etapa){
		this.etapa = etapa;
	}

	public Etapa getEtapa(){
		return this.etapa;
	}

	public void cancelarProyecto () {
		this.etapa.cancelarProyecto(this);
		this.objetivo = this.getObjetivo() + "(Cancelado)";
	}

	public String getObjetivo(){
		return this.objetivo;
	}

}
