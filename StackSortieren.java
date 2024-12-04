public class StackSortieren {

    public static void main(String[] args) {
        Stack s = new Stack();
        // Füge 10 zufällige Zahlen zum Stack hinzu
        for (int i = 0; i < 10; i++) {
            s.push((int) (Math.random() * 100));
        }

        Stack hilf = new Stack();
        // Sortiere den Stack s mit Hilfe des Hilfsstacks hilf
        while (!s.isEmpty()) {
            int element = s.pop();
            // Verschiebe Elemente zurück in s, bis die richtige Position für element
            // gefunden ist
            while (!hilf.isEmpty() && hilf.top() > element) {
                s.push(hilf.pop());
            }
            hilf.push(element);
        }

        // Verschiebe die sortierten Elemente zurück in den ursprünglichen Stack s
        while (!hilf.isEmpty()) {
            s.push(hilf.pop());
        }

        // Gib die sortierten Elemente aus
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}