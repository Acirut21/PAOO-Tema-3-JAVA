public class Main {
    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 1000);
        Produs produs = ProductAdapter.productToProdus(p);
        System.out.println("Produs: " + produs.getNume() + ", Pret (lei): " + produs.getPretLei());

        Produs pr = new Produs(2, "Telefon", 2250);
        Product product = ProductAdapter.produsToProduct(pr);
        System.out.println("Product: " + product.getName() + ", Price (USD): " + product.getPriceUsd());
    }
}