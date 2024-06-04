package ar.edu.unlp.info.oo2.ejercicio_6;

import java.util.ArrayList;

public class Mixta extends Topografia{
	private ArrayList<Topografia> composicion = new ArrayList<Topografia> ();
	
	public Mixta (Topografia uno, Topografia dos, Topografia tres, Topografia cuatro ) {
		composicion.add(uno);
		composicion.add(dos);
		composicion.add(tres);
		composicion.add(cuatro);
	}

	@Override
	public double proporcionAgua() {
		return composicion.stream().mapToDouble(a -> a.proporcionAgua()).sum() /4.0;
	}

	@Override
	public Topografia getChild(int n) {
		// TODO Auto-generated method stub
		return composicion.get(n);
	}

	@Override
	public int CantE() {
		// TODO Auto-generated method stub
		return composicion.size();
	}
	public boolean equals(Topografia t) {
		boolean es = false;
		if (this.CantE() == t.CantE() && (t.proporcionAgua() == this.proporcionAgua())) {
			int i = 0;
			es = true;
			while(es && i<this.CantE()) {
				es = this.getChild(i).equals(t.getChild(i));
				i++;
			}
		}
		return es;
	}

}
