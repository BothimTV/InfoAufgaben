public class Array2D {
  
  public static void main(String[] args) {
    int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    ausgeben(testArray);
    
    // Aufgabe 1
    // 1.1
    System.out.println(testArray[0][1]);

    // 1.2
    testArray[2][0] = 10;
    ausgeben(testArray);
    
    //System.out.println("Summe: " + summe(testArray));
    //System.out.println("Maximum: " + maximum(testArray));
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
    // TODO Implementiere eine Methode, die das Maximum eines 2D-Arrays zurückgibt
    int max = 0;
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