
public class Laufzeitmessung {

  public static void main(String[] args) {

    int n = 320000; // Länge der Zahlenliste festlegen

    Zahlenliste liste = new Zahlenliste(n); // Objekt Zahlenliste instanziieren
    Stoppuhr uhr = new Stoppuhr(); // Objekt Stoppuhr instanziieren

    liste.fuellen(); // Liste mit Zufallszahlen füllen
    uhr.start(); // Stoppuhr starten
    // liste.bubbleSort(); // Methode ausführen
    // liste.selectionSort();
    // liste.insertionSort();
    // liste.mergeSort(0,n-1);
    liste.flexSort();
    uhr.stopp(); // Stoppuhr stoppen
    System.out.println(uhr.gestoppteZeit()); // Laufzeit anzeigen

  }
}
