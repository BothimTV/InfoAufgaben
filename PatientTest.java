public class PatientTest {

  public static void main(String[] args) {

    // neue Patient-Objekte erstellen
    Patient p1 = new Patient("Max Mustermann", "AOK", 5);
    Patient p2 = new Patient("Sabine Musterfrau", "BKK", 5);

    // Patient-Methoden testen

    System.out.println(p1.getName());
    System.out.println(p1.getKasse());
    System.out.println(p1.getPriorität());
    System.out.println(" ");
    System.out.println(p2.getName());
    System.out.println(p2.getKasse());
    System.out.println(p1.getPriorität());

  }
}