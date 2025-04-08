public class ProductAdapter {
    private static final double CURS_USD_TO_LEI = 4.5;

    public static Produs productToProdus(Product product) {
        double pretLei = product.getPriceUsd() * CURS_USD_TO_LEI;
        return new Produs(product.getId(), product.getName(), pretLei);
    }

    public static Product produsToProduct(Produs produs) {
        double priceUsd = produs.getPretLei() / CURS_USD_TO_LEI;
        return new Product(produs.getId(), produs.getNume(), priceUsd);
    }
}
