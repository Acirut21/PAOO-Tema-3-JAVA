public class Main {
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();

        Aparat frigider = new Aparat("Frigiderul");
        Aparat cafea = new Aparat("Aparatul de cafea");
        Aparat tv = new Aparat("Televizorul");

        prelungitor.adaugaAparat(frigider);
        prelungitor.bagaInPriza();

        prelungitor.adaugaAparat(cafea);
        prelungitor.adaugaAparat(tv);

        // Scoate un singur aparat
        prelungitor.scoateAparat(tv);

        // Scoate tot prelungitorul din priza
        prelungitor.scoateDinPriza();
    }
}