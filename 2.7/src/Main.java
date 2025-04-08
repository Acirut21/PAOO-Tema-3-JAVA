public class Main {
    public static void main(String[] args) {
        Curs curs = new Curs();
        curs.inscrieStudent(new Student("Ana"));
        curs.inscrieStudent(new Student("Bogdan"));
        curs.inscrieStudent(new Student("Cristina"));

        // Se pot apela de mai multe ori pentru status random
        curs.prezenta();
        curs.prezenta();
    }
}