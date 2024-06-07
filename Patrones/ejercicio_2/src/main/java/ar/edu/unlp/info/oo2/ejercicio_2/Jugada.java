package ar.edu.unlp.info.oo2.ejercicio_2;

public abstract class Jugada {
	/*
	 * Retorna -1 si pierde, 0 si empata y 1 si gana
	 * */
	public abstract int jugarContra(Jugada jugada);
	public abstract int jugarContraPiedra();
	public abstract int jugarContraPapel();
	public abstract int jugarContraTijera();
}
