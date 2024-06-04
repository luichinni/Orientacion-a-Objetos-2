package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Topografia {
	
	 
	public abstract double proporcionAgua ();
	public double proporcionTierra (){
		return 1 - this.proporcionAgua();
	}
	
	public abstract Topografia getChild( int n) ;
	public abstract int CantE ();
	public abstract boolean equals(Topografia t);
}
