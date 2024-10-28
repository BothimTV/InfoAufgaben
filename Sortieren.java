
public class Sortieren {
    private int[] liste;

    public Sortieren() {
        liste = new int[20];
    }

    /*
     * Fuellt das Array mit Zufallszahlen zw. 0 und 100
     */
    public void fuellen() {
        int i;
        for (i = 0; i < liste.length; i++) {
            liste[i] = (int) (Math.random() * 100.0);
        }
    }

    /*
     * Gibt die Liste auf der Konsole aus
     */
    void ausgeben() {
        int i;
        for (i = 0; i < liste.length; i++) {
            System.out.print(liste[i] + " ");
        }
        System.out.println(" ");
    }

    /*
     * Selection Sort (Sortieren durch Auswahl)
     */
    void selectionSort() {
        // hier implementieren
        // ...
    }

    /*
     * Bubble Sort (Sortieren durch Vertauschen der Nachbarn)
     */
    void bubbleSort() {
        // hier implementieren
        // ...
    }

    /*
     * Insertion Sort (Sortieren durch Einf�gen)
     */
    void insertionSort() {
        // hier implementieren
        // ...
    }
}
