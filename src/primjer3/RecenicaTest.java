package primjer3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecenicaTest {

	String rijecp;
	String rijecn;
	int upperCase;
	int lowerCase;
	String uzorak = "NeKi PokusaJ1.";

	Recenica recenica = new Recenica();

	@Test

	public void shouldRetrunLenghtWhenInputIsString() {

		int duzina = recenica.duzinaStringa(uzorak);
		assertEquals(14, duzina);

	}

	@Test
	public void shouldReturnCharacterWhenItsOnSteamPosition() {
		rijecp = recenica.parniKarakteri(uzorak);
		assertEquals("NKoua", rijecp);
	}

	@Test
	public void shouldReturnCharacterWhenItsOnOddPosition() {
		rijecn = recenica.neparniKarakteri(uzorak);
		assertEquals("eiPksJ", rijecn);

	}

	@Test

	public void shouldReturnNumberUpperCaseWhenTheyExist() {
		upperCase = recenica.vratiUpperCase(uzorak);
		assertEquals(4, upperCase);
	}

	@Test

	public void shouldReturnNumberLowerCaseWhenTheyExist() {
		lowerCase = recenica.vratiUpperCase(uzorak);
		assertEquals(7, lowerCase);
	}

	@Test
	public void shouldReturnNonCharactersWhenTheyExist() {
		rijecp = recenica.vratiZnakoveILIbrojeve(uzorak);
		assertEquals(" 1.", rijecp);

	}
}
