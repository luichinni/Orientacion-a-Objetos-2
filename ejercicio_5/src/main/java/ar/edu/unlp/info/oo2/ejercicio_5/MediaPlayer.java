package ar.edu.unlp.info.oo2.ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private  List<Media> media= new ArrayList<Media> ();
	
	public void play ()	{
		System.out.println("en media player");
		media.stream().forEach(a -> a.play());
	}	
 public void agregar (Media media) {
	 this.media.add(media);
 }

}
