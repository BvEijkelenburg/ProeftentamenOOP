package proeftentamen.luchtvaartmaatschappij;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LvmManager {
	public LuchtvaartMaatschappij lvmInladen(String naam) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(naam);
		ObjectInputStream ois = new ObjectInputStream(fis);

		LuchtvaartMaatschappij deLvm = (LuchtvaartMaatschappij) ois.readObject();
		ois.close();
		
		return deLvm;
	}
}
