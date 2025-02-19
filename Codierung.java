public class Codierung {
  private final static String CODEWORT = "geheim123";

  public static void main(String[] args) {
    // Testen der Methoden:

    System.out.println("Zeichenkette:");
    Zeichenkette();

    System.out.println("\nErsetzen:");
    Ersetzen("ä ö ü Hallo");

    System.out.println("Passworteingabe");
    PasswortKorrekt("geheim123");

    // System.out.println("ZiffernErsetzen:");
    // ZiffernErsetzen("Hallo 123 Welt");

    // System.out.println("\nAnzahlE:");
    // AnzahlE("Hallo Welt");
  }

  public static void Zeichenkette() {
    String eingabe = "Hallo, wie geht es dir?";
    int laenge = eingabe.length();
    char zeichen = eingabe.charAt(laenge - 1);
    String ausgabe = "Der Text: " + eingabe + " ist " + laenge + " Zeichen lang.";
    System.out.println(ausgabe);
    ausgabe = "Das letzte Zeichen ist: " + zeichen;
    System.out.println(ausgabe);

    // Hier Methode erweitern nach Aufgabe 1 a) und b)
    System.out.println("Erstes Zeichen: " + eingabe.charAt(0) + " Letztes Zeichen: " + eingabe.charAt(laenge - 1));
  }

  public static boolean PasswortKorrekt(String eingabe) {
    // Implementierung von Aufgabe 1b
    if (eingabe.equals(CODEWORT)) {
      System.out.println("Passwort korrekt!");
      return true;
    } else {
      System.out.println("Passwort falsch!");
      return false;
    }
  }

  public static void Ersetzen(String eingabe) {
    // Implementierung von Aufgabe 2
    String ausgabe = "";
    int laenge = eingabe.length();

    for (int i = 0; i < laenge; i = i + 1) {
      char zeichen = eingabe.charAt(i);

      if (zeichen == 'ä') {
        ausgabe = ausgabe + "ae";
      } else {
        ausgabe = ausgabe + zeichen;
      }
    }

    System.out.println(ausgabe);
  }

  public static void ZiffernErsetzen(String eingabe) {
    // Implementierung von Aufgabe 3
  }

  public static void AnzahlE(String eingabe) {
    // Implementierung von Aufgabe 4
  }
}
