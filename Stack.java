public class Stack {
  private String[] s;

  public Stack() {
    s = new String[0];
  }

  public boolean isEmpty() {
    if (s.length == 0) {
      return true;
    } else {
      return false;
    } // end of if-else
  }

  public String top() {
    if (!isEmpty()) {
      return s[0];
    } else {
      return null;
    } // end of if-else
  }

  public void push(String inhalt) {
    String[] hilf = new String[s.length + 1];
    for (int i = 0; i < s.length; i++) {
      hilf[i + 1] = s[i];
    }
    hilf[0] = inhalt;
    s = hilf;
  }

  public String pop() {
    if (!isEmpty()) {
      String element = s[0];
      String[] hilf = new String[s.length - 1];
      for (int i = 0; i < hilf.length; i++) {
        hilf[i] = s[i + 1];
      }
      s = hilf;
      return element;
    }
    return null;
  }

}