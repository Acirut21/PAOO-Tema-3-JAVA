// Interfețele pentru produse
public interface Masina {
    void descriere();
}

public interface Scaun {
    void descriere();
}

// Clasa pentru masina electrica
public class MasinaElectrica implements Masina {
    @Override
    public void descriere() {
        System.out.println("Masina electrica.");
    }
}

// Clasa pentru masina pe benzina
public class MasinaPeBenzina implements Masina {
    @Override
    public void descriere() {
        System.out.println("Masina pe benzina.");
    }
}

// Clasa pentru scaunul de masina electrică
public class ScaunElectrica implements Scaun {
    @Override
    public void descriere() {
        System.out.println("Scaun pentru masina electrica.");
    }
}

// Clasa pentru scaunul de masina pe benzina
public class ScaunBenzina implements Scaun {
    @Override
    public void descriere() {
        System.out.println("Scaun pentru masina pe benzina.");
    }
}

// Factory Abstract
public interface MasinaFactory {
    Masina createMasina();
    Scaun createScaun();
}

// Fabrica pentru masina electrica
public class MasinaElectricaFactory implements MasinaFactory {
    @Override
    public Masina createMasina() {
        return new MasinaElectrica();
    }

    @Override
    public Scaun createScaun() {
        return new ScaunElectrica();
    }
}

// Fabrica pentru masina pe benzina
public class MasinaPeBenzinaFactory implements MasinaFactory {
    @Override
    public Masina createMasina() {
        return new MasinaPeBenzina();
    }

    @Override
    public Scaun createScaun() {
        return new ScaunBenzina();
    }
}