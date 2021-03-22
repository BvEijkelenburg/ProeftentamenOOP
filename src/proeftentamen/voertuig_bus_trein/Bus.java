package proeftentamen.voertuig_bus_trein;

public class Bus extends Voertuig {
    private int zitplaatsen;

    public Bus(String tp, int mS, int zp) {
        super(tp, mS);
        zitplaatsen = zp;
    }

    public void snelheidVerhogen() {
        if (huidigeSnelheid + 10 <= maximumSnelheid) {
            huidigeSnelheid += 10;
        }
    }

    public void snelheidVerlagen() {
        if (huidigeSnelheid - 10 >= 0) {
            huidigeSnelheid -= 10;
        } else {
            huidigeSnelheid = 0;
        }
    }

    public String toString() {
        String formatString = "Bus (%d zitplaatsen) rijdt nu %d (max.: %d). %s";
        return String.format(formatString, zitplaatsen, huidigeSnelheid, maximumSnelheid, super.toString());
    }
}
