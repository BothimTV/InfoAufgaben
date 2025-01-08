class Graph {
    private Knoten[] knotenListe;
    private int[][] adjazenzMatrix;
    private int anzahlKnoten;

    public Graph(int maxAnzahlKnoten) {
        knotenListe = new Knoten[maxAnzahlKnoten];
        adjazenzMatrix = new int[maxAnzahlKnoten][maxAnzahlKnoten];
        anzahlKnoten = 0;
    }

    /**
     * Wenn man versucht mehr Knoten als maxAnzahlKnoten hinzuzufügen, wird eine
     * Fehlermeldung ausgegeben, der Knoten wird nicht hinzugefügt.
     */
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
            /**
             * Man setzt das Gewicht in der Adjazenzmatrix an zwei Stellen, da der Graph
             * ungerichtet und daher gespiegelt ist.
             */
            adjazenzMatrix[vonIndex][nachIndex] = gewicht;
            adjazenzMatrix[nachIndex][vonIndex] = gewicht;
        } else {
            System.out.println("Knoten nicht gefunden.");
        }
    }

    /**
     * Hilfsmethode, um den Index eines Knotens in der Knotenliste zu finden.
     * Dies funktioniert indem man die Liste aller Knoten durchgeht und den Namen
     * mit dem gesuchten Knoten vergleicht.
     * Wenn der Name übereinstimmt, wird der Index zurückgegeben, ansonsten -1.
     */
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