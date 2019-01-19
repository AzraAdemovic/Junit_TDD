package primjer2;

public class Konverter {

	public double KilogramUFunte(double kolicina) {
		double rezultat = kolicina * 2.20458554;

		return rezultat;

	}

	public double FuntiUkg(double kolicina) {
		double rezultat = kolicina / 2.20458554;
		return rezultat;

	}

	public double CmUinche(double kolicina) {
		double rezultat = kolicina / 2.54;
		return rezultat;
	}

	public double InchUCm(double kolicina) {
		double rezultat = kolicina * 2.54;
		return rezultat;
	}

	public double CuFarenhajte(double kolicina) {
		double rezultat = kolicina / 0.556;
		return rezultat;
	}

	public double FarenhajteuC(double kolicina) {
		double rezultat = kolicina * 0.556;
		return rezultat;
	}

}
