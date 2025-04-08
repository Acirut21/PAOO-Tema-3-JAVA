public class ShapeFactory {

    // Creeaza o forma pe baza numarului de argumente
    public static Shape createShape(float... values) {
        if (values.length == 1) {
            // Un singur parametru -> cerc
            return new Circle(values[0]);
        } else if (values.length == 2) {
            // Doua dimensiuni -> dreptunghi
            return new Rectangle(values[0], values[1]);
        } else {
            throw new IllegalArgumentException("Numar invalid de argumente.");
        }
    }
}