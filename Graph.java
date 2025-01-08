  class Graph {
    private Knoten[] knotenListe;
    private int[][] adjazenzMatrix;
    private int anzahlKnoten;

    public Graph(int maxAnzahlKnoten) {
        knotenListe = new Knoten[maxAnzahlKnoten];
        adjazenzMatrix = new int[maxAnzahlKnoten][maxAnzahlKnoten];
        anzahlKnoten = 0;
    }

    public void knotenHinzufuegen(Knoten knoten) {
        if (anzahlKnoten < knotenListe.length) {
            knotenListe[anzahlKnoten] = knoten;
            anzahlKnoten++;
        } else {
            System.out.println("Maximale Anzahl an Knoten erreicht.");
        }
    }

    public void kanteHinzufuegen(Knoten von, Knoten nach, int gewicht) {
        int vonIndex = knotenIndexFinden(von);
        int nachIndex = knotenIndexFinden(nach);

        if (vonIndex != -1 && nachIndex != -1) {
            adjazenzMatrix[vonIndex][nachIndex] = gewicht;
            adjazenzMatrix[nachIndex][vonIndex] = gewicht; 
        } else {
            System.out.println("Knoten nicht gefunden.");
        }
    }

    private int knotenIndexFinden(Knoten knoten) {
        for (int i = 0; i < anzahlKnoten; i++) {
            if (knotenListe[i].getName().equals(knoten.getName())) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String ausgabe = "  ";
        for (int i = 0; i < anzahlKnoten; i++) {
            ausgabe += knotenListe[i].getName() + " ";
        }
        ausgabe += "\n";

        for (int i = 0; i < anzahlKnoten; i++) {
            ausgabe += knotenListe[i].getName() + " ";
            for (int j = 0; j < anzahlKnoten; j++) {
                ausgabe += adjazenzMatrix[i][j] + " ";
            }
            ausgabe += "\n";
        }
        return ausgabe;
    }
}