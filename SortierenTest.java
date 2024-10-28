public class SortierenTest {

  public static void main(String[] args) {
    // Neues Objekt der Klasse Sortieren
    Sortieren sort = new Sortieren();

    // Neue Liste mit Zufallszahlen füllen
    sort.fuellen();

    // Liste ausgeben
    sort.ausgeben();

    // Sortieren

    // sort.insertionSort();
    // sort.bubbleSort();
    // sort.selectionSort();

    // Sortierte Liste ausgeben
    sort.ausgeben();
  }

}