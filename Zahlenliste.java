
public class Zahlenliste
{ 
  private int[] liste;

    /*
     * Die Länge des Arrays wird als Parameter übergeben
     */
  public Zahlenliste(int laenge)
  {
    liste = new int[laenge];
  }

    /*
     * Fuellt die Liste mit Zufallszahlen zw. 0 und 1000
     */
  public void fuellen()
  {
    int i;
    for (i = 0; i < liste.length; i++)
    {
      liste[i] = (int)(Math.random() * 1000);
    }
  }

    /*
     * Gibt die Liste auf der Konsole aus
     */
  public void ausgeben()
  {
    int i;
    for (i = 0; i < liste.length; i++)
    {
      System.out.print(liste[i] + " ");
    }
    System.out.println();
  }

  /*
   * Insertion Sort 
  */
  public void insertionSort() { 
    for (int i = 1; i < liste.length; i++) {
        int key = liste[i]; 
        int j = i - 1;

        while (j >= 0 && liste[j] > key) {
            liste[j + 1] = liste[j];
            j--; 
        }
        liste[j + 1] = key; 
    }
}
 
  /*
     * Selection Sort 
  */
  public void selectionSort()
  {
    int min;
    int minIndex;
    for (int i = 0; i < liste.length; i++) {
      min = 10000;
      minIndex = i;
      for (int j = i; j < liste.length; j++) {
        if (liste[j] < min) {
          min = liste[j];
          minIndex = j;
        } 
      }  
      liste[minIndex] = liste[i];
      liste[i] = min;
    } 
  }

    /*
     * Bubble Sort
     */
  public void bubbleSort()
  {
    for (int i = 0; i < liste.length - 1; i++) {
      for (int j = 0; j < liste.length - i -1 ; j++) {
        if (liste[j+1] < liste[j]) {
          int temp = liste[j];
          liste[j] = liste[j+1];
          liste[j+1] = temp;
        } // end of if
      } // end of for
    } // end of for
  }
  
    /*
     * Flex Sort
     */
  public void flexSort()
  {
    for (int i = 0; i < liste.length - 1; i++) {
      for (int j = 0; j < liste.length -1 ; j++) {
        if (liste[j+1] < liste[j]) {
          int temp = liste[j];
          liste[j] = liste[j+1];
          liste[j+1] = temp;
        } // end of if
      } // end of for
    } // end of for
  }

    /*
     * Merge Sort
     */
  public void mergeSort(int start, int end) {
    if (start < end) {
      int middle = (start + end) / 2;
      
      mergeSort(start, middle);
      mergeSort(middle + 1, end);
      
      merge(start, middle, end);
    }
  }

  public void merge(int start, int middle, int end) {
    int n1 = middle - start + 1;
    int n2 = end - middle;
    
    int[] left = new int[n1];
    int[] right = new int[n2];
    
    for (int i = 0; i < n1; i++) {
      left[i] = liste[start + i];
    }
    for (int j = 0; j < n2; j++) {
      right[j] = liste[middle + 1 + j];
    }
    
    int i = 0, j = 0, k = start;
    
    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        liste[k] = left[i];
        i++;
      } else {
        liste[k] = right[j];
        j++;
      }
      k++;
    }
    
    while (i < n1) {
      liste[k] = left[i];
      i++;
      k++;
    }
    while (j < n2) {
      liste[k] = right[j];
      j++;
      k++;
    }
  }

}
