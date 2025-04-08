public class Main {
    public static void main(String[] args) {
        C2Nr c2 = new C2Nr(1, 2);
        System.out.println("Suma C2Nr: " + c2.getSum());

        C3Nr c3 = new C3Nr(1, 2, 3);
        System.out.println("Suma C3Nr: " + c3.getSum());

        C3Nr c3FromC2 = Adapter.convert(c2);
        System.out.println("Suma C3Nr din C2Nr: " + c3FromC2.getSum());
    }
}
