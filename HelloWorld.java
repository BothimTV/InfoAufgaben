import java.util.Scanner;

public static void main (String[] args) {

    // Aufgabe 1
    System.out.println("Hello world!");

    // Aufgabe 2
    // 2.1

    int alter = 18;
    System.out.println("Alter: " + alter);

    // 2.2

    String name = "Merlin";
    System.out.println("Hallo, " + name);

    // Aufgabe 3
    // 3.1

    Scanner scanner = new Scanner(System.in);
    int res = scanner.nextInt();

    if (res > 10) System.out.println("Zahl größer als 10!");
    if (res < 10) System.out.println("Zahl kleiner oder gleich 10!");

    // 3.2

    /**
     * Bei 25, "Es ist warm."
     * Bei 10, "Es ist kühl."
     * Bei -20, "Es ist eisig kalt!"
     */

    int temperatur = 25;
    if (temperatur < 0) {
        System.out.println("Es ist eigig kalt!");
    } else if (temperatur < 15) {
        System.out.println("Es ist kühl.");
    } else {
        System.out.println("Es ist warm.");
    }

    // Aufgabe 4
    // 4.1
    int i = 0;
    while (i < 10) {
        i++
    }

    // 4.2
    for (int x = 10; x <= 1; x--) {
        System.out.println(x);
    }

    // 4.3

    /**
     * Ausgabe:
     * "*****"
     */
    // Vor Änderung
    for (int y = 0; y < 5; y++) {
        System.out.println("*")
    }

    // Nach Änderung
    for (int z = 0; z < 1; z++) {
        System.out.println("**\n")
    }

}