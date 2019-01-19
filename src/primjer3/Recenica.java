package primjer3;

public class Recenica {

	String parni = "";
	String neparni = "";
	int counter = 0;
	String znak = "";

	public int duzinaStringa(String uzorak) {
		for (int i = 0; i < uzorak.length(); i++) {
			if (uzorak.length() > 0) {
				return uzorak.length();
			}
		} 

		return 0;
	}

	public String parniKarakteri(String uzorak) {
		
		for (int i = 0; i < uzorak.length(); i++) {
			char slovo = uzorak.charAt(i);
			if (i % 2 == 0 && Character.isLetter(slovo)) {
				parni += slovo;
			}
			
		}

		return parni;
	}

	public String neparniKarakteri(String uzorak) {
		for (int i = 0; i < uzorak.length(); i++) {
			char slovo = uzorak.charAt(i);

			if (i % 2 != 0 && Character.isLetter(slovo)) {
				neparni += slovo;
			}
			
		}
		return neparni;
	
	}

	public int vratiUpperCase(String uzorak) {
		for (int i = 0; i < uzorak.length(); ) {
			char slovo = uzorak.charAt(i);

			if (Character.isUpperCase(slovo)) {
				counter++;

			}
			

		}
		return counter;
	}
	
	public int vratiLowerCase(String uzorak) {
		for (int i = 0; i< uzorak.length(); i ++) {
			char slovo = uzorak.charAt(i);
			if ( Character.isLowerCase(slovo)) {
				counter++;
			}
		}
		return counter;

		
	}

	public String vratiZnakoveILIbrojeve(String uzorak)	{
		for (int i =0; i< uzorak.length(); i ++) {
			if (!Character.isLetter(uzorak.charAt(i))) {
				znak += uzorak.charAt(i);
			}
			
		}
	
	
	return znak;
	}
}
