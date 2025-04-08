public class Main {
    public static void main(String[] args) {
        // Crearea unei pizza margherita
        Pizza pizzaMargherita = new Pizza.PizzaBuilder()
                .setTip("Margherita")
                .setDimensiune("Mare")
                .cuSosDeRoșii()
                .cuMozzarella()
                .build();
        pizzaMargherita.descriere();

        System.out.println();

        // Crearea unei pizza cu pepperoni
        Pizza pizzaPepperoni = new Pizza.PizzaBuilder()
                .setTip("Pepperoni")
                .setDimensiune("Mica")
                .cuSosDeRoșii()
                .cuMozzarella()
                .cuPepperoni()
                .build();
        pizzaPepperoni.descriere();
    }
}