package proeftentamen.voertuig_bus_trein;

public class Application {
    public static void main(String[] args) {
        // Bus b1 = new Voertuig("Daf", 100);
        // Niet toegestaan, Voertuig IS geen (sub)type van Bus, en kan dus niet aan een Bus-variabele toegekend worden
        // Daarnaast is Voertuig abstract, en kan er überhaupt geen object van gemaakt worden.


        Voertuig v1 = new Trein("Fyra", 275);
        // Toegestaan, Trein IS een (sub)type van Voertuig, en kan dus toegekend worden aan een Voertuig-variabele.


        // Voertuig v2 = new Voertuig("Daf", 100);
        // Niet toegestaan, Voertuig is abstract, en er kan dus geen object van gemaakt worden.

    }
}
