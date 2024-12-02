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
        Queue hilf = new Queue();
        Patient maxPrio = new Patient(null, null, -1);

        while (!q.isEmpty()) {
            Patient p = q.dequeue();
            if (p.getPriorität() > maxPrio.getPriorität()) {
                if (maxPrio.getPriorität() != -1) {
                    hilf.enqueue(maxPrio);
                }
                maxPrio = p;
            } else {
                hilf.enqueue(p);
            }
        }
        while (!hilf.isEmpty()) {
            q.enqueue(hilf.dequeue());
        }
        return maxPrio;
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
        // Variable n deklarieren und initialisieren
        int n = 0;
        // Hilfs-Queue erstellen
        Queue hilf = new Queue();
        // Alle Patienten aus der Warteschlange in die Hilfs-Queue einfügen und dabei
        // die Anzahl der Patienten zählen
        while (!q.isEmpty()) {
            hilf.enqueue(q.dequeue());
            n++;
        }
        // Alle Patienten wieder in die Warteschlange übertragen
        while (!hilf.isEmpty()) {
            q.enqueue(hilf.dequeue());
        }
        // Rückgabe der Anzahl der Patienten
        return n;
    }

    /*
     * Der Patient mit Namen "pName" wird aus der Warteschlange entfernt.
     * Zur Vereinfachung wird angenommen, dass Namen nicht mehrfach vorkommen.
     * Falls der Patient gefunden und geloescht wurde, wird true zurueckgegeben,
     * sonst false.
     */
    public boolean loeschen(String pName) {
        // Hilfs-Queue erstellen
        Queue hilf = new Queue();
        // boolean gefunden initialisieren, um später zu überprüfen, ob der Patient
        // gefunden wurde
        boolean gefunden = false;
        // Hilfs-Objekt deklarieren
        Patient pHilf;
        while (!q.isEmpty()) {
            // Patient aus der Warteschlange entfernen
            pHilf = q.dequeue();

            // Überprüfen, ob der Patient gefunden wurde
            if (!pHilf.getName().equals(pName)) {
                // Falls nicht, wird der Patient in die Hilfs-Queue eingefügt
                hilf.enqueue(pHilf);
            } else {
                // Falls der Patient gefunden wurde, wird die Variable gefunden auf true
                // gesetzt, der Patient wird nicht in die Hilfs-Queue eingefügt
                gefunden = true;
            } // end of if-else
        } // end of while
        while (!hilf.isEmpty()) {
            // Alle Patienten aus der Hilfs-Queue wieder in die Warteschlange ein
            q.enqueue(hilf.dequeue());
        } // end of while
          // Rückgabe, ob der Patient gefunden wurde
        return gefunden;
    }
}