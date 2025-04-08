class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    // Calculeaza modulul
    public double modulus() {
        return Math.sqrt(real * real + imag * imag);
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}