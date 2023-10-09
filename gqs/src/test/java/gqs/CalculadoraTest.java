package gqs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	
	@Test
	void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7)==10);
		
	}
}
