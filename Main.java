public class Main {
    public static void main(String[] args) {
        // Erstelle einen Graphen A mit 4 Knoten und zeichne 3 Kanten ein.
        Graph graphA = new Graph(4);
        Knoten a = new Knoten("A");
        Knoten b = new Knoten("B");
        Knoten c = new Knoten("C");
        Knoten d = new Knoten("D");
        graphA.knotenHinzufuegen(a);
        graphA.knotenHinzufuegen(b);
        graphA.knotenHinzufuegen(c);
        graphA.knotenHinzufuegen(d);
        graphA.kanteHinzufuegen(a, b, 5);
        graphA.kanteHinzufuegen(a, c, 2);
        graphA.kanteHinzufuegen(b, d, 1);
        System.out.println("Graph A:");
        System.out.println(graphA); // Ausgabe der Adjazenzmatrix

    }
}