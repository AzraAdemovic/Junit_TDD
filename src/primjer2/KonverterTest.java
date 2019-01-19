package primjer2;

import static org.junit.Assert.*;

import org.junit.Test;

public class KonverterTest {

	Konverter konverter = new Konverter();

	@Test

	public void shouldReturnFunteWhenInputIsKg() {
		double rezultat = konverter.KilogramUFunte(10);
		assertEquals(22.0458554, rezultat, 0);

	}

	@Test

	    public void shouldReturnKGWhenInputIsFunte() {
		double rezultat = konverter.FuntiUkg(22.0458554);
		assertEquals(10, rezultat, 0);

	}

	@Test

	public void shouldReturnInchWhenInputIsCm() {
		double rezultat = konverter.CmUinche(20);
		assertEquals(7.874015748031496, rezultat, 0);
	}

	@Test

	public void shouldReturnCmWhenInputIsInch() {
		double rezultat = konverter.InchUCm(7.874015748031496);
		assertEquals(20, rezultat, 0);
	}

	@Test

	public void shouldReturnFWhenInputIsC() {
		double rezultat = konverter.CuFarenhajte(7);
		assertEquals(12.589928057553955, rezultat, 0);
	}

	@Test

	public void shouldReturnCWhenInputIsF() {
		double rezultat = konverter.FarenhajteuC(12.589928057553955);
		assertEquals(7, rezultat, 0);
	}
}
