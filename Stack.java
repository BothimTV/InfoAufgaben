public class Stack{
  private int[] s;
 
  public Stack()
  {
    s = new int[0];
  }                  
  
  public boolean isEmpty()
  {
    if (s.length == 0) {
      return true;
    }
    else {
      return false;
    } // end of if-else
  }

  
  public int top(){
    if (!isEmpty()) {
      return s[0];
    } 
    else {
      return 0;
    } // end of if-else
  }
    
    
    
  public void push(int inhalt){
    int[] hilf = new int[s.length +1];
    for (int i = 0; i < s.length; i++) {
      hilf[i+1] = s[i];
    }
    hilf[0] = inhalt;
    s = hilf;
  }
      
      
  public int pop(){
    if(!isEmpty()){
      int element = s[0];
      int[] hilf = new int[s.length -1];
      for (int i = 0; i < hilf.length; i++) {
        hilf[i] = s[i+1];
      }
      s = hilf;
      return element;
    }
    return 0;
  }
      
} 