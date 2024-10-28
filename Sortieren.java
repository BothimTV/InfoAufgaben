
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
        boolean läuft = true;

        int offset = 0;
        while (läuft) {
            boolean änderung = false;
            for (int i = 0; i < arr.length - 1 - offset; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    änderung = true;
                }
            }
            offset++;
            if (!änderung) {
                läuft = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * Insertion Sort (Sortieren durch Einf�gen)
     */
    void insertionSort() {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
