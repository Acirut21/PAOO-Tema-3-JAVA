public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }
}