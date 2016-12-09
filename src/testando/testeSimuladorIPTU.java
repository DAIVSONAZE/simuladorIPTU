package testando;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import calculo.Simulador;

public class testeSimuladorIPTU {

	private Simulador Simulador;

	@Before
	public void setup() {

		this.Simulador = new Simulador();
	}

	@Test
	public void test() {

		double result = this.Simulador.calcularIPTU("1", 180000, 0);
		double valorEsperado = 1164.55;
		assertEquals(valorEsperado, result, 0.1);

	}

}
