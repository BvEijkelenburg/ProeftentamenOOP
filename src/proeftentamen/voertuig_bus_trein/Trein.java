package proeftentamen.voertuig_bus_trein;

public class Trein extends Voertuig {
    private boolean inVeiligheidsModus;

    public Trein(String tp, int mS) {
        super(tp, mS);
    }

    public void setVeiligheidsModus(boolean vM) {
        inVeiligheidsModus = vM;
    }

    public void snelheidVerhogen() {
        int max = maximumSnelheid;

        if (inVeiligheidsModus) {
            max /= 2;
        }

        if (huidigeSnelheid + 20 <= max) {
            huidigeSnelheid += 20;
        }
    }

    public void snelheidVerlagen() {
        if (huidigeSnelheid - 20 >= 0) {
            huidigeSnelheid -= 20;
        } else {
            huidigeSnelheid = 0;
        }
    }

    public String toString() {
        String modus = "uit";
        if (inVeiligheidsModus) {
            modus = "aan";
        }

        String resultaat = "Trein (veiligheidsmodus: " +modus+ ") ";
        resultaat += "rijdt nu " +huidigeSnelheid+ " (max.: " +maximumSnelheid+ "). ";
        resultaat += super.toString();

        return resultaat;
    }
}
