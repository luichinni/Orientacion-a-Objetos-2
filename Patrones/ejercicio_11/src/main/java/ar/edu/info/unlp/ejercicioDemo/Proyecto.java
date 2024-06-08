package ar.edu.info.unlp.ejercicioDemo;

import java.sql.Date;

public class Proyecto {
	private Date feChaI;
	private Date fechaF;
	private double margenG;
	private String objetivo;
	private int integrantes;
	private double montoPorDia;
	private Etapa etapas;
	
	public Proyecto(Date fechaI,Date fechaF,String objetivo,int integrantes, double montoDia)
	{
		this.etapas = new EtContruccion();
		this.fechaF= fechaF;
		this.feChaI = fechaI;
		this.integrantes= integrantes;
		this.margenG = 7;
		this.objetivo = objetivo; 
		this.montoPorDia = montoDia;
	}
	
	public double getCosto() {
		return 0;
	};
	
	public double getPrecio() {
		return 0;
	};
	
	public void aprobarEtapa() {
		
	};
	
	public void modifMargenGanancia () {
		
	}
	
	public void cancelarProyecto () {
		
	}
	
}
