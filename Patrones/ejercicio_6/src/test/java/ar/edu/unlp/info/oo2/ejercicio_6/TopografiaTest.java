package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	Agua a1;
	Agua a2;
	Agua a3;
	Agua a4;
	Tierra t1;
	Tierra t2;
	Tierra t3;
	Tierra t4;
	Mixta m1;
	Mixta m2;
	Mixta m3;
	Mixta m4;
	Mixta m5;
	Mixta m6;
	
	Pantano p1;
	Pantano p2;
	Pantano p3;
	Pantano p4;
	Mixta m7;
	
	@BeforeEach
	void topoSetup() {
		a1 = new Agua();
		a2 = new Agua();
		a3 = new Agua();
		a4 = new Agua();
		t1 = new Tierra();
		t2 = new Tierra();
		t3 = new Tierra();
		t4 = new Tierra();
		m1 = new Mixta(a1,a2,a3,t1);
		m2 = new Mixta(a4,a2,a3,t1);
		m3 = new Mixta(t1,a2,t4,t3);
		m4 = new Mixta(a1,a2,a3,a4);
		m5 = new Mixta(t1,a2,t3,m1);
		m6 = new Mixta(t1,a2,t3,m2);
		
		p1 = new Pantano();
		p2 = new Pantano();
		p3 = new Pantano();
		p4 = new Pantano();
		m7 = new Mixta(p1,t2,m5,p2);
	}
	
	@Test
	public void topoProporcionTest(){
		assertEquals(1, a1.proporcionAgua());
		assertEquals(0, a1.proporcionTierra());
		assertEquals(0, t1.proporcionAgua());
		assertEquals(1, t1.proporcionTierra());
		
		assertEquals(0.75,m1.proporcionAgua(),0.1);
		assertEquals((1.75/4.0),m5.proporcionAgua(),0.1);
		assertEquals(0.7,p1.proporcionAgua(),0.1);
		assertEquals(((0.7+((1.75)/4.0)+0.7)/4.0),m7.proporcionAgua(),0.1);
	}
	
	@Test
	public void topoEqualsTest() {
		assertTrue(a1.equals(a2));
		assertFalse(a1.equals(t2));
		assertTrue(t1.equals(t2));
		assertFalse(t2.equals(a2));
		assertFalse(m1.equals(m3));
		assertTrue(m1.equals(m2));
		assertTrue(m5.equals(m6));
		assertFalse(m6.equals(m2));
	}
}
