import java.util.Random;

public class Student {
    private String nume;
    private Random random;

    public Student(String nume) {
        this.nume = nume;
        this.random = new Random();
    }

    // Genereaza status random: "prezent" sau "absent"
    public String getStatus() {
        return random.nextBoolean() ? "prezent" : "absent";
    }

    public String getNume() {
        return nume;
    }
}