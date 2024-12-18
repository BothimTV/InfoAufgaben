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

  // Aufgabe 2.3
  public void reverse() {
    Stack hilf = new Stack();
    while (!isEmpty()) {
      hilf.push(pop());
    }
    while (!hilf.isEmpty()) {
      push(hilf.pop());
    }
  }

  // Aufgabe 2.3
  public int findString(String element) {
    for (int i = 0; i < s.length; i++) {
      if (s[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  // Aufgabe 2.3
  public void sort(boolean aufsteigend) {
    Stack hilf = new Stack();
    while (!isEmpty()) {
      String element = pop();
      if (hilf.isEmpty()) {
        hilf.push(element);
      } else {
        while (!hilf.isEmpty()
            && (aufsteigend ? element.compareTo(hilf.top()) > 0 : element.compareTo(hilf.top()) < 0)) {
          push(hilf.pop());
        }
        hilf.push(element);
      }
    }
    while (!hilf.isEmpty()) {
      push(hilf.pop());
    }
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