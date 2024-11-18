public class StackTest{
  public static void main(String[] args){
    StackString s = new StackString();
    s.push("5");
    s.push("2");
    s.push("9");
    s.push("12");
    s.push("3");
    
    StackString hilf = new StackString();
    int length = 0;
    
    while (!s.isEmpty()) { 
      String e = s.pop();
      length += 1;
      System.out.println(e);
      hilf.push(e); 
    }
    
    while (!hilf.isEmpty()) { 
      s.push(hilf.pop());
    }
    
    System.out.println("Länge: " + length);
  }
}