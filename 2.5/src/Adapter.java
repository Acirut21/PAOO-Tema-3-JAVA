public class Adapter {
    // Metoda care converteste o instanta de C2Nr intr-o instanta de C3Nr
    public static C3Nr convert(C2Nr c2nr) {
        // Al treilea numar este 0 in lipsa de alte informatii
        return new C3Nr(c2nr.getA(), c2nr.getB(), 0);
    }
}