public class Array2D {

  public static void main(String[] args) {
    int[][] testArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    ausgeben(testArray);

    // Aufgabe 1
    // 1.1
    System.out.println(testArray[0][1]);

    // 1.2
    testArray[2][0] = 10;
    ausgeben(testArray);

    // Aufgabe 2
    // 2.1
    /*
     * Die Methode summe soll die Summe aller Elemente des 2D-Arrays zurückgeben.
     * Dabei geht sie für jede Zeile jedes Element durch und addiert es zur Summe.
     * Dafür benötigt man eine äußerer Schleife, die die Zeilen durchgeht und eine
     * innere Schleife, die die Elemente der Zeile durchgeht.
     */
    // 2.2
    System.out.println("Maximum: " + maximum(testArray));

    // System.out.println("Summe: " + summe(testArray));
  }

  public static int summe(int[][] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        sum = sum + array[i][j];
      }
    }
    return sum;
  }

  public static int maximum(int[][] array) {
    // 2.2
    int max = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
        }
      }
    }
    return max;
  }

  public static void ausgeben(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}