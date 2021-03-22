package proeftentamen.student_opleiding;

public class Opleiding {
    private String naam;
    private String variant;
    private int studieduur;
    private int minimumECs;

    public Opleiding(String nm, int std, int mEs) {
        this(nm, "voltijd", std, mEs);
    }

    public Opleiding(String nm, String v, int std, int mEs) {
        this.naam = nm;
        this.variant = v;
        this.studieduur = std;
        this.minimumECs = mEs;
    }

    public String getNaam() {
        return naam;
    }

    public void setStudieduur(int std) {
        studieduur = std;
    }

    public void wijzigVariant(String v) {
        if (v.equals("voltijd") || v.equals("deeltijd")) {
            variant = v;
        }
    }

    public String toString() {
        return String.format("%s (%s) duurt %d jaar en je haalt daarin minimaal %d EC", naam, variant, studieduur, minimumECs);
    }
}
