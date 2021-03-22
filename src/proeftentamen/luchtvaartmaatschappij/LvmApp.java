package proeftentamen.luchtvaartmaatschappij;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class LvmApp extends Application {
    public void start(Stage stage) throws IOException {
        String fxmlPagina = "LvmScreen.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        /* Aanmaken voorbeeldbestand, geen onderdeel van de opgaven */

        LuchtvaartMaatschappij lvm = new LuchtvaartMaatschappij("KLM");
        lvm.voegVliegtuigToe(new Vliegtuig("Boeing 787-9", 2, "PH-BHP"));
        try (var x = new ObjectOutputStream(Files.newOutputStream(Path.of("lvm.obj")))) {
            x.writeObject(lvm);
        } catch (IOException ioe) {
            System.out.println("Aanmaken testbestand lvm.obj mislukt... ");
        }

        /* Starten GUI */
        launch(args);
    }
}
