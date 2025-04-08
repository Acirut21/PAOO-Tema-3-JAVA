public class Main {
    public static void main(String[] args) {
        // Alegem fabrica de mobilier clasic
        MobilierFactory factoryClasic = new MobilierClasicFactory();
        Scaun scaunClasic = factoryClasic.createScaun();
        Masa masaClasic = factoryClasic.createMasa();

        scaunClasic.descriere();
        masaClasic.descriere();

        // Alegem fabrica de mobilier modern
        MobilierFactory factoryModern = new MobilierModernFactory();
        Scaun scaunModern = factoryModern.createScaun();
        Masa masaModern = factoryModern.createMasa();

        scaunModern.descriere();
        masaModern.descriere();
    }
}