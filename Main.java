public class Main {
    public static void main(String[] args) {
        Graph graph1 = new Graph(10);
        graph1.fuegeKanteHinzu(new Kante(0, 1));
        graph1.fuegeKanteHinzu(new Kante(1, 2));
        graph1.fuegeKanteHinzu(new Kante(1, 3));
        graph1.fuegeKanteHinzu(new Kante(1, 4));
        graph1.fuegeKanteHinzu(new Kante(4, 5));
        graph1.fuegeKanteHinzu(new Kante(4, 7));
        graph1.fuegeKanteHinzu(new Kante(4, 9));
        graph1.fuegeKanteHinzu(new Kante(5, 6));
        graph1.fuegeKanteHinzu(new Kante(6, 7));
        graph1.fuegeKanteHinzu(new Kante(7, 8));

        System.out.println("Graph 1 Tiefensuche:");
        graph1.starteTiefensuche(0);

        System.out.println("Graph 1 Breitensuche:");
        graph1.breitensuche(0);
        ;
    }
}