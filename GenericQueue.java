public class GenericQueue<T> {
  private T[] q;

  @SuppressWarnings("unchecked")
  public GenericQueue() {
    q = (T[]) new Object[0];
  }   
    
  public boolean isEmpty() {
    return q.length == 0;
  }
    
  public T head() {
    return isEmpty() ? null : q[0];
  }
    
  @SuppressWarnings("unchecked")
  public void enqueue(T data) { 
    T[] hilf = (T[]) new Object[q.length + 1];
    for (int i = 0; i < q.length; i++) {
      hilf[i] = q[i];
    }
    hilf[q.length] = data;
    q = hilf;  
  }
    
  @SuppressWarnings("unchecked")
  public T dequeue() {
    if (!isEmpty()) {
      T temp = q[0];
      T[] hilf = (T[]) new Object[q.length - 1];
      for (int i = 0; i < hilf.length; i++) {
        hilf[i] = q[i + 1];
      } 
      q = hilf;
      return temp;
    }
    return null;
  }
}