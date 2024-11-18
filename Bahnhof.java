public class Bahnhof {
    private StackString gleis1;
    private StackString gleis2;
    private StackString gleis3;
    private StackString gleis4;

    public Bahnhof() {
        gleis1 = new StackString();
        gleis2 = new StackString();
        gleis3 = new StackString();
        gleis4 = new StackString();
    }

    public void fuellen(String farbe) {
        if (!farbe.equals("rot") && !farbe.equals("blau") && !farbe.equals("gruen")) {
            System.out.println("Fehler: Der Waggon hat eine ungültige Farbe.");
            return;
        }
        gleis1.push(farbe);
    }

    public void sortieren() {
        // Solange Gleis 1 nicht leer ist, werden Waggons sortiert.
        while (!gleis1.isEmpty()) {
            // Den obersten Waggon von Gleis 1 nehmen und zwischenspeichern.
            String temp = gleis1.pop();

            // Wenn der Waggon rot ist, wird er auf Gleis 2 geschoben.
            if (temp.equals("rot")) {
                gleis2.push(temp);
            }
            // Wenn der Waggon blau ist, wird er auf Gleis 3 geschoben.
            if (temp.equals("blau")) {
                gleis3.push(temp);
            }
            // Wenn der Waggon gruen ist, wird er auf Gleis 4 geschoben.
            if (temp.equals("gruen")) {
                gleis4.push(temp);
            }
        } // Ende der while-Schleife
    }

    public void gleiseAusgeben() {

        // Gleis 1 ausgeben
        System.out.println("Gleis 1: ");
        // Temporären Stack erstellen, um die Waggons von Gleis 1 zwischenzuspeichern
        StackString temp1 = new StackString();
        // Alle Waggons von Gleis 1 in den temporären Stack verschieben und ausgeben
        while (!gleis1.isEmpty()) {
            String waggon = gleis1.pop(); // Waggon vom Gleis nehmen
            System.out.println(waggon); // Waggon ausgeben
            temp1.push(waggon); // Waggon in den temporären Stack legen
        }
        // Waggons vom temporären Stack zurück auf Gleis 1 verschieben
        while (!temp1.isEmpty()) {
            gleis1.push(temp1.pop()); // Waggon vom temporären Stack zurück auf Gleis 1 legen
        }

        // Gleis 2 ausgeben (analog zu Gleis 1)
        System.out.println("Gleis 2: ");
        StackString temp2 = new StackString();
        while (!gleis2.isEmpty()) {
            String waggon = gleis2.pop();
            System.out.println(waggon);
            temp2.push(waggon);
        }
        while (!temp2.isEmpty()) {
            gleis2.push(temp2.pop());
        }

        // Gleis 3 ausgeben (analog zu Gleis 1 und 2)
        System.out.println("Gleis 3: ");
        StackString temp3 = new StackString();
        while (!gleis3.isEmpty()) {
            String waggon = gleis3.pop();
            System.out.println(waggon);
            temp3.push(waggon);
        }
        while (!temp3.isEmpty()) {
            gleis3.push(temp3.pop());
        }

        // Gleis 4 ausgeben (analog zu Gleis 1, 2 und 3)
        System.out.println("Gleis 4: ");
        StackString temp4 = new StackString();
        while (!gleis4.isEmpty()) {
            String waggon = gleis4.pop();
            System.out.println(waggon);
            temp4.push(waggon);
        }
        while (!temp4.isEmpty()) {
            gleis4.push(temp4.pop());
        }

        System.out.println(" "); // Leerzeile zur besseren Lesbarkeit
    }

}