public class Main {
    public static void main(String[] args) {
        // Crearea unei masini electrice
        Masina masinaElectrica = MasinaFactory.createMasina("electrica");
        masinaElectrica.descriere();

        // Crearea unei masini pe benzina
        Masina masinaPeBenzina = MasinaFactory.createMasina("benzina");
        masinaPeBenzina.descriere();
    }
}