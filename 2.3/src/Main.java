public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, -1);

        System.out.println("Suma(Complex, Complex): " + ComplexOperations.suma(c1, c2));
        System.out.println("Suma(Double, Double): " + ComplexOperations.suma(3.0, 5.0));
        System.out.println("Suma(Complex, Double): " + ComplexOperations.suma(c1, 7.0));
        System.out.println("Suma(Double, Complex): " + ComplexOperations.suma(2.0, c2));
    }
}