package proeftentamen.student_opleiding;

public class Student {
    private String naam;
    private int leeftijd;
    private Opleiding mijnOpleiding;

    public Student(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public void setOpleiding(Opleiding opl) {
        mijnOpleiding = opl;
    }

    public Opleiding getOpleiding() {
        return mijnOpleiding;
    }

    public String toString() {
        String resultaat = "Student " +naam+ " (" +leeftijd+ " jr)";

        if (mijnOpleiding != null) {
            resultaat += " volgt de opleiding " + mijnOpleiding.getNaam();
        } else {
            resultaat += " volgt geen opleiding";
        }

        return resultaat;
    }
}
