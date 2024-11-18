public class BahnhofTest {

    public static void main(String[] args) {

        // Test 1: Erstellen eines neuen Bahnhofs
        System.out.println("Test 1: Erstellen eines neuen Bahnhofs");
        Bahnhof bahnhof = new Bahnhof();
        System.out.println("Bahnhof erstellt.");

        // Test 2: Befüllen von Gleis 1 mit Waggons
        System.out.println("\nTest 2: Befüllen von Gleis 1 mit Waggons");
        bahnhof.fuellen("rot");
        bahnhof.fuellen("blau");
        bahnhof.fuellen("rot");
        bahnhof.fuellen("rot");
        bahnhof.fuellen("blau");
        System.out.println("Gleis 1 befüllt mit: rot, blau, rot, rot, blau");

        // Test 3: Ausgabe der Gleise vor dem Sortieren
        System.out.println("\nTest 3: Ausgabe der Gleise vor dem Sortieren");
        bahnhof.gleiseAusgeben();
        // Erwartete Ausgabe:
        // Gleis 1: blau, rot, rot, blau, rot
        // Gleis 2:
        // Gleis 3:

        // Test 4: Sortieren der Waggons
        System.out.println("\nTest 4: Sortieren der Waggons");
        bahnhof.sortieren();
        System.out.println("Waggons sortiert.");

        // Test 5: Ausgabe der Gleise nach dem Sortieren
        System.out.println("\nTest 5: Ausgabe der Gleise nach dem Sortieren");
        bahnhof.gleiseAusgeben();
        // Erwartete Ausgabe:
        // Gleis 1:
        // Gleis 2: rot, rot, rot
        // Gleis 3: blau, blau

        // --- Testfälle zum Ausfüllen ---

        // Test 6: Erstellen eines neuen Bahnhofs und Befüllen mit einer anderen
        // Reihenfolge von Waggons
        System.out.println(
                "\nTest 6: Erstellen eines neuen Bahnhofs und Befüllen mit einer anderen Reihenfolge von Waggons");
        Bahnhof bahnhof2 = new Bahnhof();
        // TODO: Befülle bahnhof2 mit Waggons in einer anderen Reihenfolge.

        // Ausgabe der Gleise vor dem Sortieren (bahnhof2)
        System.out.println("Ausgabe der Gleise vor dem Sortieren (bahnhof2)");
        bahnhof2.gleiseAusgeben();
        // Erwartete Ausgabe: (abhängig von der gewählten Reihenfolge)

        // Sortieren und Ausgabe der Gleise (bahnhof2)
        System.out.println("Sortieren und Ausgabe der Gleise (bahnhof2)");
        bahnhof2.sortieren();
        bahnhof2.gleiseAusgeben();
        // Erwartete Ausgabe: (abhängig von der gewählten Reihenfolge)

        // Test 7: Testen mit einem leeren Bahnhof
        System.out.println("\nTest 7: Testen mit einem leeren Bahnhof");
        Bahnhof bahnhof3 = new Bahnhof();
        // TODO: Rufe die Methode sortieren() auf und gib die Gleise aus. Was passiert?
        System.out.println("Sortieren und Ausgabe der Gleise (bahnhof3)");
        bahnhof3.sortieren();
        bahnhof3.gleiseAusgeben();
        // Erwartete Ausgabe:
    }
}