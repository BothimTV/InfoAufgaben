public class Kante {
    private int start;
    private int ende;
    private int gewicht; // Gewicht der Kante hinzugefügt

    public Kante(int start, int ende, int gewicht) {
        this.start = start;
        this.ende = ende;
        this.gewicht = gewicht;
    }

    public int getStart() {
        return start;
    }

    public int getEnde() {
        return ende;
    }

    public int getGewicht() {
        return gewicht;
    }
}