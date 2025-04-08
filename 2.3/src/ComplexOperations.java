public class ComplexOperations {

    // Suma clasica intre doua numere complexe
    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        double real = nr1.getReal() + nr2.getReal();
        double imag = nr1.getImag() + nr2.getImag();
        return new ComplexNumber(real, imag);
    }

    // Suma intre doua Double-uri convertite la ComplexNumber
    public static ComplexNumber suma(Double nr1, Double nr2) {
        ComplexNumber c1 = DoubleToComplexAdapter.convert(nr1);
        ComplexNumber c2 = DoubleToComplexAdapter.convert(nr2);
        return suma(c1, c2);
    }

    // Suma intre ComplexNumber si Double -> convertim ComplexNumber la modul, adunam cu Double si convertim inapoi la ComplexNumber
    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        double val1 = ComplexToDoubleAdapter.convert(nr1);
        double result = val1 + nr2;
        return DoubleToComplexAdapter.convert(result);
    }

    // Suma intre Double si ComplexNumber (identic cu cazul anterior, doar invers parametrii)
    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        double val2 = ComplexToDoubleAdapter.convert(nr2);
        double result = nr1 + val2;
        return DoubleToComplexAdapter.convert(result);
    }
}
