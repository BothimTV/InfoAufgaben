public class QueueTest{
  public static void main(String[] args){
    GenericQueue<String> q = new GenericQueue<String>();
    q.enqueue("Lani");
    q.enqueue("Mio");
    q.enqueue("Ivana");
    q.enqueue("Mariella");
    q.enqueue("Rojin");
    q.enqueue("Julian");
    q.enqueue("Ich");
    q.enqueue("Naod");
    
    
    String first = q.head();
    while (!q.isEmpty()) {
      String p = q.dequeue(); 
      System.out.println(p);
      q.enqueue(p);  
    } // end of while
    }
}