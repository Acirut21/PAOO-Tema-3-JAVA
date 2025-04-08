// Interfața pentru obiectele care pot fi create
public interface Masina {
    void descriere();
}

// Clasa concretă pentru MasinaElectrica
public class MasinaElectrica implements Masina {
    @Override
    public void descriere() {
        System.out.println("Masina electrica.");
    }
}

// Clasa concretă pentru MasinaPeBenzina
public class MasinaPeBenzina implements Masina {
    @Override
    public void descriere() {
        System.out.println("Masina pe benzina.");
    }
}

// Factory
public class MasinaFactory {
    public static Masina createMasina(String tip) {
        if (tip.equals("electrica")) {
            return new MasinaElectrica();
        } else if (tip.equals("benzina")) {
            return new MasinaPeBenzina();
        }
        throw new IllegalArgumentException("Tip de masina necunoscut.");
    }
}