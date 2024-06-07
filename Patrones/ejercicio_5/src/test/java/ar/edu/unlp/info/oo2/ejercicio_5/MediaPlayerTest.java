package ar.edu.unlp.info.oo2.ejercicio_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	private MediaPlayer mediaPlayer;
	
	@BeforeEach
	 void MediaPlayerTestSetUp (){
		
		mediaPlayer = new MediaPlayer();
		mediaPlayer.agregar(new AdapterVideoS(new VideoStream()) );
		mediaPlayer.agregar(new Audio());
		mediaPlayer.agregar(new VideoFile());
		mediaPlayer.agregar(new Audio());
	}
	
	@Test
	public void playTest() {
		mediaPlayer.play();
	}
	

}
