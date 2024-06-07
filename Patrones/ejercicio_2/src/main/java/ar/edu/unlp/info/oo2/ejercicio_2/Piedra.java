package ar.edu.unlp.info.oo2.ejercicio_2;

public class Piedra extends Jugada {

	@Override
	public int jugarContra(Jugada jugada) {
		return jugada.jugarContraPiedra() * -1;
	}

	@Override
	public int jugarContraPiedra() {
		return 0;
	}

	@Override
	public int jugarContraPapel() {
		return -1;
	}

	@Override
	public int jugarContraTijera() {
		return 1;
	}

}
