package ar.edu.unlp.info.oo2.ejercicio_2;

public class Piedra extends Jugada {

	@Override
	public boolean jugarContra(Jugada jugada) {
		return !jugada.jugarContraPiedra();
	}

	@Override
	public boolean jugarContraPiedra() {
		return false;
	}

	@Override
	public boolean jugarContraPapel() {
		return false;
	}

	@Override
	public boolean jugarContraTijera() {
		return false;
	}

}
