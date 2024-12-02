public class WartezimmerUI {

  public static void main(String[] args) {
    Wartezimmer wz = new Wartezimmer();

    Patient p1 = new Patient("Max Mustermann", "AOK");
    Patient p2 = new Patient("Sabine Musterfrau", "BKK");
    Patient p3 = new Patient("Peter Peters", "Allianz");
    Patient p4 = new Patient("Lisa Lustig", "AOK");
    Patient p5 = new Patient("Menko Mansen", "DEBEKA");

    // Patient p1 kommt ins Wartezimmer
    wz.einfuegen(p1);

    // Patient p2 kommt ins Wartezimmer
    wz.einfuegen(p2);

    // Anzahl der Patienten ausgeben
    System.out.println(wz.anzahl());

    // Patient p3 kommt ins Wartezimmer
    wz.einfuegen(p3);

    // Patient p2 hat einen Termin und geht vorzeitig, danach wird die Anzahl der
    // Patienten im Wartezimmer ausgegeben
    System.out.println(wz.loeschen("Sabine Musterfrau"));
    System.out.println(wz.anzahl());

    // Der erste Patient kann ins Behandlungszimmer
    System.out.println(wz.naechsterPatient().getName());

    // Der zweite Patient kann ins Behandlungszimmer
    System.out.println(wz.naechsterPatient().getName());

    // Patienten p4 und p5 kommen ins Wartezimmer
    wz.einfuegen(p4);
    wz.einfuegen(p5);

  }
}