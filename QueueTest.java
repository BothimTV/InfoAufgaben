public class QueueTest {
  public static void main(String[] args) {
    Queue queue = new Queue();

    queue.enqueue(1);
    queue.enqueue(7);
    queue.enqueue(13);
    queue.enqueue(7);
    queue.enqueue(5);

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());

    queue.enqueue(6);
    queue.enqueue(7);

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());

    queue.enqueue(8);
    System.out.println(queue.dequeue());
  }
}