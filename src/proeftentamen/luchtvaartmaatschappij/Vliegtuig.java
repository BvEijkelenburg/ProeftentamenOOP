package proeftentamen.luchtvaartmaatschappij;

import java.io.Serializable;

public class Vliegtuig implements Serializable {
	private String type;
	private int aantalMotoren;
	private String registratieNummer; 
	
	public Vliegtuig(String tp, int aM, String rN) {
		type = tp;
		aantalMotoren = aM;
		registratieNummer = rN;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj instanceof Vliegtuig) {
			Vliegtuig anderVliegtuig = (Vliegtuig)obj;
			
			if (this.type.equals(anderVliegtuig.type) && 
					this.aantalMotoren == anderVliegtuig.aantalMotoren &&
					registratieNummer.equals(anderVliegtuig.registratieNummer)) {
				
				result = true;
			}
		}
		
		return result;
	}
	
//	Alternatief voor equals:
//	public boolean equals(Object obj) {
//		boolean result = obj instanceof Vliegtuig;
//		
//		result = result && type.equals(((Vliegtuig)obj).type);
//		result = result && aantalMotoren == ((Vliegtuig)obj).aantalMotoren;
//		result = result && registratieNummer.equals(((Vliegtuig)obj).registratieNummer);
//		
//		return result;
//	}
	
	public String toString() {
		return type + ", " + aantalMotoren + " motoren, registratie: " + registratieNummer;
	}
}
