package proeftentamen.student_opleiding;

public class Application {
    public static void main(String[] args) {
        Opleiding opleiding = new Opleiding("HBO-ICT", 4, 240);
        Student student = new Student("Piet", 20);

        student.setOpleiding(opleiding);
        opleiding.wijzigVariant("deeltijd");
        System.out.println(student);
    }
}
