public class Spielbrett {

    public String[][] feld = new String[3][3];
    public boolean gewonnen = false;

    public boolean setzeStein(int y, int x, Spieler spieler1, Spieler spieler2) {
        if (y < 1 || y > feld.length || x < 1 || x > feld[0].length) {
            return false;
        }
        if (feld[y - 1][x - 1] == null) {
            feld[y - 1][x - 1] = spieler1.amZug ? "X" : "O";
            checkGewinner(spieler1, spieler2);
            return true;
        }
        return false;
    }

    public void checkGewinner(Spieler spieler1, Spieler spieler2) {
        String gewinner = "";
        for (int i = 0; i < feld.length; i++) {
            if (checkZeile(i)) {
                gewonnen = true;
                gewinner = feld[i][0];
            }
        }
        for (int i = 0; i < feld[0].length; i++) {
            if (checkSpalte(i)) {
                gewonnen = true;
                gewinner = feld[0][i];
            }
        }
        if (checkDiagonal()) {
            gewinner = feld[1][1];
            gewonnen = true;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (gewinner.equals("X")) {
            System.out.println(spieler1.name + " hat gewonnen");
        } else if (gewinner.equals("O")) {
            System.out.println(spieler2.name + " hat gewonnen");
        }
    }

    private boolean checkZeile(int zeile) {
        return feld[zeile][0] != null && feld[zeile][0].equals(feld[zeile][1]) && feld[zeile][0].equals(feld[zeile][2]);
    }

    private boolean checkSpalte(int spalte) {
        return feld[0][spalte] != null && feld[0][spalte].equals(feld[1][spalte])
                && feld[0][spalte].equals(feld[2][spalte]);
    }

    private boolean checkDiagonal() {
        return feld[0][0] != null && feld[0][0].equals(feld[1][1]) && feld[0][0].equals(feld[2][2]) ||
                feld[0][2] != null && feld[0][2].equals(feld[1][1]) && feld[0][2].equals(feld[2][0]);
    }

    public void ausgeben() {
        System.out.println("--------");
        System.out.println("  1 2 3");
        for (int i = 0; i < feld.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j] == null ? "? " : feld[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

}