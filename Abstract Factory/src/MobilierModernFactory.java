public class MobilierModernFactory implements MobilierFactory {
    @Override
    public Scaun createScaun() {
        return new ScaunModern();
    }

    @Override
    public Masa createMasa() {
        return new MasaModern();
    }
}