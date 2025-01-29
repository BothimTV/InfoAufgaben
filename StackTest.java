public class StackTest {
  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(1);
    stack.push(5);
    stack.push(8);
    stack.push(3);
    stack.push(2);

    System.out.println(stack.pop());
    System.out.println(stack.pop());

    stack.push(6);
    stack.push(7);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    stack.push(8);
    System.out.println(stack.pop());
  }
}