package ar.edu.unlp.info.oo2.ejercicio_6;

public class Pantano extends Topografia{

	@Override
	public double proporcionAgua() {
		// TODO Auto-generated method stub
		return 0.7;
	}

	@Override
	public Topografia getChild(int n) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public int CantE() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Topografia t) {
		// TODO Auto-generated method stub
		return (this.CantE() == t.CantE() && (t.proporcionAgua() == this.proporcionAgua()));
	}

}
