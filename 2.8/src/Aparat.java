public class Aparat {
    private String nume;

    public Aparat(String nume) {
        this.nume = nume;
    }

    public void pornit() {
        System.out.println(nume + " a fost conectat la curent.");
    }

    public void oprit() {
        System.out.println(nume + " a fost deconectat de la curent.");
    }
}