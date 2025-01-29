public class Main {
    public static void main(String[] args) {
        // Beispielgraph 1 erstellen (gewichteter Graph)
        Graph graph = new Graph(7); // Graph mit 7 Knoten
        // Die Knoten werden hier mit Indices 0-6 benannt (entspricht A, B, C, ...)

        // Kantengewichte für Graph 1 festlegen
        int gewicht_AB = 4;
        int gewicht_AD = 2;
        int gewicht_BC = 3;
        int gewicht_BE = 1;
        int gewicht_CF = 5;
        int gewicht_EG = 2;

        // Kanten mit Gewichten hinzufügen (ungerichtet)
        graph.fuegeKanteHinzu(new Kante(0, 1, gewicht_AB)); // Kante zwischen Knoten 0 (A) und 1 (B) mit Gewicht 4
        graph.fuegeKanteHinzu(new Kante(0, 3, gewicht_AD)); // Kante zwischen Knoten 0 (A) und 3 (D) mit Gewicht 2
        graph.fuegeKanteHinzu(new Kante(1, 2, gewicht_BC)); // Kante zwischen Knoten 1 (B) und 2 (C) mit Gewicht 3
        graph.fuegeKanteHinzu(new Kante(1, 4, gewicht_BE)); // Kante zwischen Knoten 1 (B) und 4 (E) mit Gewicht 1
        graph.fuegeKanteHinzu(new Kante(2, 5, gewicht_CF)); // Kante zwischen Knoten 2 (C) und 5 (F) mit Gewicht 5
        graph.fuegeKanteHinzu(new Kante(4, 6, gewicht_EG)); // Kante zwischen Knoten 4 (E) und 6 (G) mit Gewicht 2

        // Breitensuche testen auf Graph 1
        System.out.println("\nGraph 1:");
        System.out.println("Breitensuche ab Knoten 0 (A):");
        graph.breitensuche(0);

        // Tiefensuche testen auf Graph 1
        System.out.println("Tiefensuche ab Knoten 0 (A):");
        graph.starteTiefensuche(0);

        // Beispielgraph 2 erstellen (gewichteter, unzusammenhängender Graph)
        Graph graph1 = new Graph(7); // 7 Knoten (A-G)

        // Kantengewichte für Graph 2 festlegen
        int gewicht_AB_g1 = 2;
        int gewicht_AC_g1 = 8;
        int gewicht_BD_g1 = 5;
        int gewicht_BE_g1 = 3;
        int gewicht_CE_g1 = 1;
        int gewicht_FG_g1 = 6;

        // Kanten mit Gewichten hinzufügen (ungerichtet) für Graph 2
        graph1.fuegeKanteHinzu(new Kante(0, 1, gewicht_AB_g1)); // A-B, Gewicht 2
        graph1.fuegeKanteHinzu(new Kante(0, 2, gewicht_AC_g1)); // A-C, Gewicht 8
        graph1.fuegeKanteHinzu(new Kante(1, 3, gewicht_BD_g1)); // B-D, Gewicht 5
        graph1.fuegeKanteHinzu(new Kante(1, 4, gewicht_BE_g1)); // B-E, Gewicht 3
        graph1.fuegeKanteHinzu(new Kante(2, 4, gewicht_CE_g1)); // C-E, Gewicht 1
        graph1.fuegeKanteHinzu(new Kante(5, 6, gewicht_FG_g1)); // F-G, Gewicht 6

        // Breitensuche und Tiefensuche auf Graph 2 ausführen
        System.out.println("\nGraph 2:");
        System.out.println("Breitensuche ab Knoten 4 (E):");
        graph1.breitensuche(4);
        System.out.println("Tiefensuche ab Knoten 4 (E):");
        graph1.starteTiefensuche(4);

        // Beispielgraph 3 erstellen (gewichteter, dichterer Graph)
        Graph graph2 = new Graph(7); // 7 Knoten (A-G)

        // Kantengewichte für Graph 3 festlegen
        int gewicht_AB_g2 = 7;
        int gewicht_AC_g2 = 2;
        int gewicht_AG_g2 = 9;
        int gewicht_BD_g2 = 1;
        int gewicht_CE_g2 = 3;
        int gewicht_DE_g2 = 4;
        int gewicht_BF_g2 = 6;
        int gewicht_CG_g2 = 5;
        int gewicht_EG_g2 = 8;

        // Kanten mit Gewichten hinzufügen (ungerichtet) für Graph 3
        graph2.fuegeKanteHinzu(new Kante(0, 1, gewicht_AB_g2)); // A-B, Gewicht 7
        graph2.fuegeKanteHinzu(new Kante(0, 2, gewicht_AC_g2)); // A-C, Gewicht 2
        graph2.fuegeKanteHinzu(new Kante(0, 6, gewicht_AG_g2)); // A-G, Gewicht 9
        graph2.fuegeKanteHinzu(new Kante(1, 3, gewicht_BD_g2)); // B-D, Gewicht 1
        graph2.fuegeKanteHinzu(new Kante(2, 4, gewicht_CE_g2)); // C-E, Gewicht 3
        graph2.fuegeKanteHinzu(new Kante(3, 4, gewicht_DE_g2)); // D-E, Gewicht 4
        graph2.fuegeKanteHinzu(new Kante(1, 5, gewicht_BF_g2)); // B-F, Gewicht 6
        graph2.fuegeKanteHinzu(new Kante(2, 6, gewicht_CG_g2)); // C-G, Gewicht 5
        graph2.fuegeKanteHinzu(new Kante(4, 6, gewicht_EG_g2)); // E-G, Gewicht 8

        // Breitensuche und Tiefensuche auf Graph 3 ausführen
        System.out.println("\nGraph 3:");
        System.out.println("Breitensuche ab Knoten 0 (A):");
        graph2.breitensuche(0);
        System.out.println("Tiefensuche ab Knoten 0 (A):");
        graph2.starteTiefensuche(0);
    }
}