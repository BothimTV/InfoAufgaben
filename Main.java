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

        Graph graphB = new Graph(5);
        Knoten bA = new Knoten("A");
        Knoten bB = new Knoten("B");
        Knoten bC = new Knoten("C");
        Knoten bD = new Knoten("D");
        Knoten bE = new Knoten("E");
        graphB.knotenHinzufuegen(bA);
        graphB.knotenHinzufuegen(bB);
        graphB.knotenHinzufuegen(bC);
        graphB.knotenHinzufuegen(bD);
        graphB.knotenHinzufuegen(bE);
        graphB.kanteHinzufuegen(bA, bC, 1);
        graphB.kanteHinzufuegen(bA, bB, 2);
        graphB.kanteHinzufuegen(bC, bB, 5);
        graphB.kanteHinzufuegen(bB, bD, 3);
        graphB.kanteHinzufuegen(bD, bE, 4);
        System.out.println("Graph B:");
        System.out.println(graphB); // Ausgabe der Adjazenzmatrix

    }
}