public class Main {
    public static void main(String[] args) {
        Shape dreptunghi = ShapeFactory.createShape(5.0f, 3.0f);
        System.out.println("Aria dreptunghiului: " + dreptunghi.getArea());

        Shape cerc = ShapeFactory.createShape(2.5f);
        System.out.println("Aria cercului: " + cerc.getArea());
    }
}