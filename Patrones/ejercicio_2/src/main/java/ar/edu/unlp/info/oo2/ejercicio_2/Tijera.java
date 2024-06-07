package ar.edu.unlp.info.oo2.ejercicio_2;

public class Tijera extends Jugada{

	@Override
	public int jugarContra(Jugada jugada) {
		// TODO Auto-generated method stub
		return jugada.jugarContraTijera() * -1;
	}

	@Override
	public int jugarContraPiedra() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int jugarContraPapel() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int jugarContraTijera() {
		// TODO Auto-generated method stub
		return 0;
	}

}
