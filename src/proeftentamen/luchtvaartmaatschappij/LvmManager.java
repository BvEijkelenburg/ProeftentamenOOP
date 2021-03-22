package proeftentamen.luchtvaartmaatschappij;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class LvmManager {
	public LuchtvaartMaatschappij lvmInladen(String naam) throws IOException, ClassNotFoundException {
		InputStream is = Files.newInputStream(Path.of(naam));
		ObjectInputStream ois = new ObjectInputStream(is);

		LuchtvaartMaatschappij deLvm = (LuchtvaartMaatschappij) ois.readObject();
		ois.close();
		
		return deLvm;
	}
}
