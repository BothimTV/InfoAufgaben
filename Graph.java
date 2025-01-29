public class Graph {
    private int anzahlKnoten;
    private Integer[][] adjazenzmatrix; // Adjazenzmatrix speichert nun Gewichte (Integer), null bedeutet keine Kante

    public Graph(int anzahlKnoten) {
        this.anzahlKnoten = anzahlKnoten;
        this.adjazenzmatrix = new Integer[anzahlKnoten][anzahlKnoten]; // Initialisiert mit null (keine Kante)
    }

    /**
     * Fügt eine Kante mit Gewicht zum Graphen hinzu.
     * Da es sich um einen ungerichteten Graphen handelt, wird die Kante in beide Richtungen hinzugefügt.
     *
     * @param kante Die Kante, die hinzugefügt werden soll. Enthält Startknoten, Endknoten und Gewicht.
     */
    public void fuegeKanteHinzu(Kante kante) {
        adjazenzmatrix[kante.getStart()][kante.getEnde()] = kante.getGewicht();
        adjazenzmatrix[kante.getEnde()][kante.getStart()] = kante.getGewicht(); // Für ungerichtete Graphen, Gewicht in beide Richtungen setzen
    }

    /**
     * Findet die Nachbarn eines Knotens.
     * Gibt ein Array der Nachbarknoten zurück.
     *
     * @param knoten Der Knoten, dessen Nachbarn gesucht werden.
     * @return Ein Array von Nachbarknoten (Indices).
     */
    public int[] findeNachbarn(int knoten) {
        int anzahlNachbarn = 0;
        for (int i = 0; i < anzahlKnoten; i++) {
            if (adjazenzmatrix[knoten][i] != null) { // Überprüfen, ob eine Kante existiert (Gewicht ist nicht null)
                anzahlNachbarn++;
            }
        }

        int[] nachbarn = new int[anzahlNachbarn];
        int index = 0;
        for (int i = 0; i < anzahlKnoten; i++) {
            if (adjazenzmatrix[knoten][i] != null) { // Überprüfen, ob eine Kante existiert
                nachbarn[index] = i;
                index++;
            }
        }
        return nachbarn;
    }

    public int getAnzahlKnoten() {
        return anzahlKnoten;
    }

    /**
     * Breitensuche (Breadth-First Search) Implementierung.
     * Durchläuft den Graphen Level für Level, beginnend beim Startknoten.
     * Nutzt eine Queue, um die Knoten in der Reihenfolge ihrer Entdeckung zu verarbeiten.
     *
     * @param startknoten Der Knoten, von dem aus die Breitensuche gestartet wird.
     */
    public void breitensuche(int startknoten) {
        boolean[] besucht = new boolean[anzahlKnoten]; // Array, um besuchte Knoten zu markieren
        Queue schlange = new Queue(); // Queue für die Breitensuche, jetzt vom Typ Queue (angenommene benutzerdefinierte Klasse)

        besucht[startknoten] = true; // Startknoten als besucht markieren
        schlange.enqueue(startknoten); // Startknoten zur Queue hinzufügen

        System.out.print("Breitensuche-Reihenfolge (Knotenindices): "); // Ausgabe-Präfix

        while (!schlange.isEmpty()) { // Solange die Queue nicht leer ist
            int aktuellerKnoten = schlange.dequeue(); // Ersten Knoten aus der Queue entfernen und verarbeiten
            System.out.print(aktuellerKnoten + " "); // Knoten ausgeben

            int[] nachbarn = findeNachbarn(aktuellerKnoten); // Nachbarn des aktuellen Knotens finden
            for (int nachbar : nachbarn) { // Für jeden Nachbarn
                if (!besucht[nachbar]) { // Wenn der Nachbar noch nicht besucht wurde
                    besucht[nachbar] = true; // Nachbar als besucht markieren
                    schlange.enqueue(nachbar); // Nachbar zur Queue hinzufügen
                }
            }
        }
        System.out.println(); // Zeilenumbruch nach der Breitensuche-Ausgabe
    }

    /**
     * Rekursive Hilfsfunktion für die Tiefensuche.
     * Markiert den aktuellen Knoten als besucht und durchläuft rekursiv seine unbesuchten Nachbarn.
     *
     * @param startknoten Der aktuelle Knoten, der in der Tiefensuche besucht wird.
     * @param besucht     Das Array, das verfolgt, welche Knoten bereits besucht wurden.
     */
    public void tiefensuche(int startknoten, boolean[] besucht) {
        besucht[startknoten] = true; // Aktuellen Knoten als besucht markieren
        System.out.print(startknoten + " "); // Aktuellen Knoten ausgeben

        int[] nachbarn = findeNachbarn(startknoten); // Nachbarn des aktuellen Knotens finden
        for (int nachbar : nachbarn) { // Für jeden Nachbarn
            if (!besucht[nachbar]) { // Wenn der Nachbar noch nicht besucht wurde
                tiefensuche(nachbar, besucht); // Rekursiver Aufruf der Tiefensuche für den Nachbarn
            }
        }
    }

    /**
     * Startet die Tiefensuche (Depth-First Search) von einem gegebenen Startknoten.
     * Initialisiert ein Array, um besuchte Knoten zu verfolgen, und ruft die rekursive Tiefensuche-Funktion auf.
     *
     * @param startKnoten Der Knoten, von dem aus die Tiefensuche gestartet wird.
     */
    public void starteTiefensuche(int startKnoten) {
        boolean[] besucht = new boolean[anzahlKnoten]; // Array, um besuchte Knoten zu markieren, für jeden Start der Tiefensuche neu initialisiert
        System.out.print("Tiefensuche-Reihenfolge (Knotenindices): "); // Ausgabe-Präfix
        tiefensuche(startKnoten, besucht); // Aufruf der rekursiven Tiefensuche-Funktion
        System.out.println(); // Zeilenumbruch nach der Tiefensuche-Ausgabe
    }
}