package ar.edu.unlp.info.oo2.ejercicio_2;

public abstract class Jugada {
	public abstract boolean jugarContra(Jugada jugada);
	public abstract boolean jugarContraPiedra();
	public abstract boolean jugarContraPapel();
	public abstract boolean jugarContraTijera();
}
