public class DoubleToComplexAdapter {
    public static ComplexNumber convert(double value) {
        // Consideram partea imaginara 0
        return new ComplexNumber(value, 0);
    }
}
