import java.util.Scanner;

public class TikTakToe {

    private Spielbrett brett = new Spielbrett();
    private Spieler spieler1;
    private Spieler spieler2;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TikTakToe tikTakToe = new TikTakToe();
        tikTakToe.start();
    }

    public void start() {
        System.out.println("TikTakToe gestartet");

        System.out.println("Spieler 1, bitte Namen eingeben:");
        spieler1 = new Spieler(scanner.nextLine());
        spieler1.amZug = true;
        System.out.println("Spieler 2, bitte Namen eingeben:");
        spieler2 = new Spieler(scanner.nextLine());

        while (!brett.gewonnen) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if (spieler1.amZug) {
                System.out.println(spieler1.name + " ist am Zug");
            } else {
                System.out.println(spieler2.name + " ist am Zug");
            }

            brett.ausgeben();
            boolean steinGesetzt = false;
            while (!steinGesetzt) {
                System.out.println("Bitte Zeile eingeben:");
                int y = scanner.nextInt();
                System.out.println("Bitte Spalte eingeben:");
                int x = scanner.nextInt();
                steinGesetzt = brett.setzeStein(y, x, spieler1, spieler2);
                if (!steinGesetzt) {
                    System.out.println("Ungültiger Zug");
                }
            }
            spieler1.amZug = !spieler1.amZug;
            spieler2.amZug = !spieler2.amZug;

        }

    }

}