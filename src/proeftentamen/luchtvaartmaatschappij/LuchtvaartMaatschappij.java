package proeftentamen.luchtvaartmaatschappij;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")
public class LuchtvaartMaatschappij implements Serializable {
	private String naam;
	private ArrayList<Vliegtuig> alleVliegtuigen;
	
	public LuchtvaartMaatschappij(String nm) {
		naam = nm;
		alleVliegtuigen = new ArrayList<Vliegtuig>();
	}
	
	public List<Vliegtuig> getVliegtuigen() {
		return Collections.unmodifiableList(alleVliegtuigen);
	}
	
	public boolean heeftVliegtuig(String tp) {
		boolean result = false;
		
		for (Vliegtuig v : alleVliegtuigen) {
			if (v.getType().equals(tp)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public void voegVliegtuigToe(Vliegtuig v) {
		if (!alleVliegtuigen.contains(v)) {
			alleVliegtuigen.add(v);
		}
	}

	public String toString() {
		String s = "Luchtvaartmaatschappij " + naam + " bezit de volgende vliegtuigen: ";
		
		for (Vliegtuig v : alleVliegtuigen) {
			s += "\n\t" + v.toString();
		}
		
		return s;
	}
}
