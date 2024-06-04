package ar.edu.unlp.info.oo2.ejercicio_2;

public class Papel extends Jugada{

	@Override
	public int jugarContra(Jugada jugada) {
		// TODO Auto-generated method stub
		return jugada.jugarContraPapel() * -1;
	}

	@Override
	public int jugarContraPiedra() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int jugarContraPapel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int jugarContraTijera() {
		// TODO Auto-generated method stub
		return -1;
	}

}
