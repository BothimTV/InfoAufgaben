public class Graph {
    private int anzahlKnoten;
    private boolean[][] adjazenzmatrix;

    public Graph(int anzahlKnoten) {
        this.anzahlKnoten = anzahlKnoten;
        this.adjazenzmatrix = new boolean[anzahlKnoten][anzahlKnoten];
    }

    public void fuegeKanteHinzu(Kante kante) {
        adjazenzmatrix[kante.getStart()][kante.getEnde()] = true;
        adjazenzmatrix[kante.getEnde()][kante.getStart()] = true; // Für ungerichtete Graphen
    }

    public int[] findeNachbarn(int knoten) {
        int anzahlNachbarn = 0;
        for (int i = 0; i < anzahlKnoten; i++) {
            if (adjazenzmatrix[knoten][i]) {
                anzahlNachbarn++;
            }
        }

        int[] nachbarn = new int[anzahlNachbarn];
        int index = 0;
        for (int i = 0; i < anzahlKnoten; i++) {
            if (adjazenzmatrix[knoten][i]) {
                nachbarn[index] = i;
                index++;
            }
        }
        return nachbarn;
    }

    public int getAnzahlKnoten() {
        return anzahlKnoten;
    }

    public void breitensuche(int startknoten) {
        boolean[] besucht = new boolean[anzahlKnoten];
        Queue schlange = new Queue();

        besucht[startknoten] = true;
        schlange.enqueue(startknoten);

        while (!schlange.isEmpty()) {
            int aktuellerKnoten = schlange.dequeue();
            System.out.print(aktuellerKnoten + " ");

            int[] nachbarn = findeNachbarn(aktuellerKnoten);
            for (int i = 0; i < nachbarn.length; i++) {
                int nachbar = nachbarn[i];
                if (!besucht[nachbar]) {
                    besucht[nachbar] = true;
                    schlange.enqueue(nachbar);
                }
            }
        }
        System.out.println();
    }

    public void tiefensuche(int startknoten, boolean[] besucht) {
        besucht[startknoten] = true;
        System.out.print(startknoten + " ");

        int[] nachbarn = findeNachbarn(startknoten);
        for (int i = 0; i < nachbarn.length; i++) {
            int nachbar = nachbarn[i];
            if (!besucht[nachbar]) {
                tiefensuche(nachbar, besucht);
            }
        }
    }

    public void starteTiefensuche(int startKnoten) {
        boolean[] besucht = new boolean[anzahlKnoten];
        tiefensuche(startKnoten, besucht);
        System.out.println();
    }
}