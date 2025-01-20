public class Main {
    public static void main(String[] args) {
        // Beispielgraph erstellen
        Graph graph = new Graph(7); // Graph mit 7 Knoten
        // Die Knoten werden hier einfach durchnummeriert: 0, 1, 2, 3, ...
        // Kanten hinzufügen (ungerichtet)

        graph.fuegeKanteHinzu(new Kante(0, 1)); // Kante zwischen Knoten 0 und 1
        graph.fuegeKanteHinzu(new Kante(0, 2)); // Kante zwischen Knoten 0 und 2
        graph.fuegeKanteHinzu(new Kante(1, 3));
        graph.fuegeKanteHinzu(new Kante(1, 4));
        graph.fuegeKanteHinzu(new Kante(2, 5));
        graph.fuegeKanteHinzu(new Kante(3, 6));

        // Breitensuche testen
        System.out.println("Breitensuche ab Knoten 5:");
        graph.breitensuche(5);

        // Tiefensuche testen
        System.out.println("Tiefensuche ab Knoten 3:");
        graph.starteTiefensuche(3);

        // Weiteren Graphen zum Testen erstellen, unzusammenhängend
        Graph graph1 = new Graph(7);
        graph1.fuegeKanteHinzu(new Kante(0, 1));
        graph1.fuegeKanteHinzu(new Kante(0, 2));
        graph1.fuegeKanteHinzu(new Kante(0, 6));
        graph1.fuegeKanteHinzu(new Kante(1, 3));
        graph1.fuegeKanteHinzu(new Kante(1, 4));
        graph1.fuegeKanteHinzu(new Kante(2, 4));
        graph1.fuegeKanteHinzu(new Kante(6, 5));

        System.out.println("Breitensuche ab Knoten 4:");
        graph1.breitensuche(4);
    }
}