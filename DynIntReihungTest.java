public class DynIntReihungTest {

  public static void main(String[] args) {
    // Neues Objekt vom Typ Dynamische Reihung
    DynIntReihung reihung = new DynIntReihung();

    // Dynamische Reihung mit Zufallszahlen füllen
    for (int i = 0; i < 10; i++) {
      reihung.append((int) (Math.random() * 100));
    }

    reihung.insertAt(4, 7777);

    // Nicht-sortierte Reihung ausgeben
    for (int i = 0; i < reihung.getLength(); i++) {
      System.out.println(reihung.getItem(i));
    }

    // hier Bubblesort implementieren
    for (int i = 0; i < reihung.getLength(); i++) {
      for (int j = 0; j < reihung.getLength() - i - 1; j++) {
        if (reihung.getItem(j) > reihung.getItem(j + 1)) {
          int temp = reihung.getItem(j);
          reihung.setItem(j, reihung.getItem(j + 1));
          reihung.setItem(j + 1, temp);
        }
      }
    }

    // Sortierte Reihung ausgeben
    System.out.println(" ");

    for (int i = 0; i < reihung.getLength(); i++) {
      System.out.println(reihung.getItem(i));
    }

  }
}
