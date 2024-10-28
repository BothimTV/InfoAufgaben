
public class Sortieren {
    private int[] arr;

    public Sortieren() {
        arr = new int[20];
    }

    /*
     * Fuellt das Array mit Zufallszahlen zw. 0 und 100
     */
    public void fuellen() {
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100.0);
        }
    }

    /*
     * Gibt die arr auf der Konsole aus
     */
    void ausgeben() {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
