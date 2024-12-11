public class Array2DChallengeReloaded {

    public static void main(String[] args) {
        // Hier kannst du deine Arrays erstellen und die Methoden testen

        // Beispiel:
        int[][] testArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // int[][] testArray2 = {{1,2,3,4},{4,5,6,4},{7,8,9,4},{7,8,9,4}};
        // int[][] testArray2 = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] testArray2 = {{1,2,3,4},{4,5,6,4},{7,8,9,4}};
        // int[][] testArray2 = {{1,2,3},{4,5,6},{7,8,9},{7,8,9}};

        ausgeben(testArray);
        System.out.println(zaehleUngerade(testArray));
        printArray(zeilensummen(testArray));
        System.out.println();
        System.out.println(spaltensumme(testArray, 1));
        try {
            System.out.println(zeileEnthalten(testArray, new int[] { 4, 5, 6 }));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        ausgeben(multipliziere(testArray, 69));
    }

    // Aufgabe 1.1
    public static void ausgeben(int[][] array) {
        // Alle Elemente ausgeben
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Aufgabe 1.2
    public static int zaehleUngerade(int[][] array) {
        // Code hier ergänzen
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Aufgabe 2.1
    public static int[] zeilensummen(int[][] array) {
        // Code hier ergänzen
        int[] summen = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int summe = 0;
            for (int j = 0; j < array[i].length; j++) {
                summe += array[i][j];
            }
            summen[i] = summe;
        }
        return summen;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Aufgabe 2.2
    public static int spaltensumme(int[][] array, int spalte) {
        // Code hier ergänzen
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i][spalte];
        }
        return summe;
    }

    // Aufgabe 3.1
    public static boolean zeileEnthalten(int[][] array, int[] zeile) {
        boolean enthalten = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != zeile.length) {
                throw new IllegalArgumentException("Die Zeilenlängen stimmen nicht überein.");
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == zeile[j]) {
                        enthalten = true;
                    } else {
                        enthalten = false;
                        break;
                    }
                }
                if (enthalten) {
                    break;
                }
            }
        }
        return enthalten;
    }

    // Aufgabe 3.2 (Zusatz)
    public static int[][] multipliziere(int[][] array, int faktor) {
        int[][] newArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = array[i][j] * faktor;
            }
        }
        return newArray;
    }
}