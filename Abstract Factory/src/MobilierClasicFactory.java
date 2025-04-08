public class MobilierClasicFactory implements MobilierFactory {
    @Override
    public Scaun createScaun() {
        return new ScaunClasic();
    }

    @Override
    public Masa createMasa() {
        return new MasaClasic();
    }
}