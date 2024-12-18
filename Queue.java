public class Queue {
  private int[] q;

  public Queue() {
    q = new int[0];
  }

  public boolean isEmpty() {
    if (q.length == 0) {
      return true;
    }
    return false;
  }

  public int head() {
    if (!isEmpty()) {
      return q[0];
    } else {
      return 0;
    }
  }

  public void enqueue(int data) {
    int[] hilf = new int[q.length + 1];
    for (int i = 0; i < q.length; i++) {
      hilf[i] = q[i];
    } // end of for
    hilf[q.length] = data;
    q = hilf;
  }

  public int dequeue() {
    if (!isEmpty()) {
      int temp = q[0];
      int[] hilf = new int[q.length - 1];
      for (int i = 0; i < hilf.length; i++) {
        hilf[i] = q[i + 1];
      }
      q = hilf;
      return temp;
    }
    return 0;
  }

} // Ende der Klasse Queue
