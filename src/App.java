public class App {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry Potter ", 1, 2, 3, 4, 5);
        Gryffindor hermione = new Gryffindor("Hermione Granger ", 65, 86, 74,56,54);
        System.out.println(harry);
        System.out.println(hermione);

        harry.compare(hermione);

    }
}
