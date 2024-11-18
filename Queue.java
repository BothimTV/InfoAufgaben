public class Queue {
  private String[] q;

  public Queue() {
    q = new String[0];
  }   
    
  public boolean isEmpty() {
    return q.length == 0;
  }
    
  public String head() {
    return isEmpty() ? "" : q[0];
  }
    
  public void enqueue(String data) { 
    String[] hilf = new String[q.length + 1];
    for (int i = 0; i< q.length; i++) {
      hilf[i] = q[i];
    }
    hilf[q.length] = data;
    q = hilf;  
  }
    
  public String dequeue() {
    if (!isEmpty()) {
      String temp = q[0];
      String[] hilf = new String[q.length - 1];
      for (int i = 0;i < hilf.length; i++) {
        hilf[i] = q[i+1];
      } 
      q = hilf;
      return temp;
    }
    return "";
  }
}
  