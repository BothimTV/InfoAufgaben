public class Wartezimmer {
    private Queue q;

    public Wartezimmer() {
        q = new Queue();
    }

    /*
     * Patient in die Warteschlange eingefuegt.
     */
    public void einfuegen(Patient pPat) {
        // Diese Methode implementieren.
        q.enqueue(pPat);
    }

    /*
     * Entfernt den Patient am Anfang der Warteschlange und gibt ihn zurueck.
     */
    public Patient naechsterPatient() {
        // Diese Methode implementieren
        return q.dequeue();
    }

    /*
     * Alle Patienten werden aus der Warteschlange entfernt.
     */
    public void alleLoeschen() {
        // Diese Methode implementieren
        while (!q.isEmpty()) {
            q.dequeue();
        } // end of while
    }

    /*
     * Gibt die Anzahl der in der Queue wartenden Patienten zurueck.
     */
    public int anzahl() {
        int n = 0;
        Queue hilf = new Queue();
        while (!q.isEmpty()) {
            hilf.enqueue(q.dequeue());
            n++;
        } // end of while
        while (!hilf.isEmpty()) {
            q.enqueue(hilf.dequeue());
        } // end of while
        return n;
    }

    /*
     * Der Patient mit Namen "pName" wird aus der Warteschlange entfernt.
     * Zur Vereinfachung wird angenommen, dass Namen nicht mehrfach vorkommen.
     * Falls der Patient gefunden und geloescht wurde, wird true zurueckgegeben,
     * sonst false.
     */
    public boolean loeschen(String pName) {
        Queue hilf = new Queue();
        boolean gefunden = false;
        Patient pHilf;
        while (!q.isEmpty()) {
            pHilf = q.dequeue();

            if (!pHilf.getName().equals(pName)) {
                hilf.enqueue(pHilf);
            } // end of if
            else {
                gefunden = true;
            } // end of if-else
        } // end of while
        while (!hilf.isEmpty()) {
            q.enqueue(hilf.dequeue());
        } // end of while
        return gefunden;
    }
}