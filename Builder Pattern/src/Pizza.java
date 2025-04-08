public class Pizza {
    private String tip;
    private String dimensiune;
    private boolean areSosDeRosii;
    private boolean areMozzarella;
    private boolean arePepperoni;

    // Constructor privat pentru a preveni crearea directa a unui obiect Pizza
    private Pizza(PizzaBuilder builder) {
        this.tip = builder.tip;
        this.dimensiune = builder.dimensiune;
        this.areSosDeRosii = builder.areSosDeRosii;
        this.areMozzarella = builder.areMozzarella;
        this.arePepperoni = builder.arePepperoni;
    }

    public void descriere() {
        System.out.println("Pizza " + tip + " " + dimensiune + " cu:");
        if (areSosDeRosii) {
            System.out.println(" - Sos de rosii");
        }
        if (areMozzarella) {
            System.out.println(" - Mozzarella");
        }
        if (arePepperoni) {
            System.out.println(" - Pepperoni");
        }
    }

    // Builder-ul pentru Pizza
    public static class PizzaBuilder {
        private String tip;
        private String dimensiune;
        private boolean areSosDeRosii;
        private boolean areMozzarella;
        private boolean arePepperoni;

        // Metode pentru a seta opțiunile
        public PizzaBuilder setTip(String tip) {
            this.tip = tip;
            return this;
        }

        public PizzaBuilder setDimensiune(String dimensiune) {
            this.dimensiune = dimensiune;
            return this;
        }

        public PizzaBuilder cuSosDeRoșii() {
            this.areSosDeRosii = true;
            return this;
        }

        public PizzaBuilder cuMozzarella() {
            this.areMozzarella = true;
            return this;
        }

        public PizzaBuilder cuPepperoni() {
            this.arePepperoni = true;
            return this;
        }

        // Metoda pentru a construi pizza
        public Pizza build() {
            return new Pizza(this);
        }
    }
}