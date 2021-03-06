package test;

import static org.junit.Assert.*;
import org.junit.*;

import entidades.*;

public class ParedTest {
	private Pared pared;
	private Tablero tablero;
	@Before
	public void IniciarTest() {
		tablero = new Tablero(25,40,200,5);
		pared=new Pared(2,3,tablero);
	}
	@After
	public void finalizarTest() {
		pared=null;
		tablero=null;
		
	}
	@Test
	public void constructorTest() {
		assertEquals(pared, tablero.getElemento(pared.getPos()));
	}
	@Test
	public void explotarTest() throws InterruptedException {
		pared.explotar();
		Thread.sleep(3000);
		assertNotEquals(pared, tablero.getElemento(pared.getPos()));		
	}
	@Test
	public void seguirExplotandoTransitableTest() {
		assertFalse(pared.puedeSeguirExplotando());
		assertFalse(pared.esTransitable());
	}
}