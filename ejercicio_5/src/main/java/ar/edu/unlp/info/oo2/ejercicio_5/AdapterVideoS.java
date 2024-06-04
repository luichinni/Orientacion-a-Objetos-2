package ar.edu.unlp.info.oo2.ejercicio_5;

public class AdapterVideoS implements Media{
	private VideoStream video;

	public AdapterVideoS (VideoStream v) {
		this.video= v;
	}
	
	public void play () {
		video.reproducir();
	}
}
