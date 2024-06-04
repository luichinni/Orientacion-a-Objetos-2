package ar.edu.unlp.info.oo2.ejercicio_6;

public class Tierra extends Topografia {

	@Override
	public double proporcionAgua() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Topografia getChild(int n) {
		return this;
	}

	@Override
	public int CantE() {
		return 1;
	}

	 @Override
	 public boolean equals(Topografia t) {
		 return (this.CantE() == t.CantE() && (t.proporcionAgua() == this.proporcionAgua()));
	 }
}
