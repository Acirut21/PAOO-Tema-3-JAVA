import java.util.ArrayList;
import java.util.List;

public class Prelungitor {
    private List<Aparat> aparate;
    private boolean esteInPriza;

    public Prelungitor() {
        aparate = new ArrayList<>();
        esteInPriza = false;
    }

    public void adaugaAparat(Aparat aparat) {
        aparate.add(aparat);
        if (esteInPriza) {
            aparat.pornit();
        }
    }

    public void scoateAparat(Aparat aparat) {
        if (aparate.contains(aparat)) {
            if (esteInPriza) {
                aparat.oprit();
            }
            aparate.remove(aparat);
        }
    }

    public void bagaInPriza() {
        if (!esteInPriza) {
            esteInPriza = true;
            for (Aparat a : aparate) {
                a.pornit();
            }
        }
    }

    public void scoateDinPriza() {
        if (esteInPriza) {
            esteInPriza = false;
            for (Aparat a : aparate) {
                a.oprit();
            }
        }
    }
}