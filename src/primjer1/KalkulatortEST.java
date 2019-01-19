package primjer1;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalkulatortEST {
	Kalkulator kalkulator = new Kalkulator();

	@Test
	public void sabiranjeTest() {

		int rezultat = kalkulator.sabiranje(2, 5);
		assertEquals(7, rezultat);
	}

	@Test
	public void oduzimanjeTest() {

		int rezultat = kalkulator.oduzimanje(5, 2);
		assertEquals(3, rezultat);
	}

	@Test

	public void mnozenjeTest() {

		int rezultat = kalkulator.mnozenje(3, 4);
		assertEquals(12, rezultat);

	}

	@Test

	public void dijeljenjeTest() {

		double rezultat = kalkulator.dijeljenje(20, 2);
		assertEquals(10, 0, rezultat);

	}

}
