package proeftentamen.luchtvaartmaatschappij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.List;

public class LvmController {
    @FXML private Label meldingen;
    @FXML private ListView<Vliegtuig> lijst;
    @FXML private TextField bestandsnaam;
    @FXML private Button inladen;

    private LvmManager manager = new LvmManager();

    public void handleLVMladen(ActionEvent event) {
        try {
            String naam = bestandsnaam.getText();
            LuchtvaartMaatschappij lvm = manager.lvmInladen(naam);

            if (lvm != null) {
                refreshVliegtuigenLijst(lvm.getVliegtuigen());
                System.out.println(lvm.getVliegtuigen().size());
                meldingen.setText("LVM ingeladen!");
            } else meldingen.setText("Geen LVM gevonden!");
        } catch (FileNotFoundException e) {
            meldingen.setText("Bestand niet gevonden!");
        } catch (Exception e) {
            meldingen.setText(e.getMessage());
        }
    }

    public void refreshVliegtuigenLijst(List<Vliegtuig> vliegtuigen) {
        lijst.getItems().clear();
        lijst.getItems().addAll(vliegtuigen);
    }
}
