public class StackString {
  private String[] s;
  public int length = 0;
 
  public StackString() {
    s = new String[0];
  }                  
  
  /**
   * Gibt zurück, ob der Stack leer ist 
   */
  public boolean isEmpty() {
    return s.length == 0;
  }
  
  /**
   * Gibt das letzte Element zurück, ohne dieses aus dem Stack zu entfernen
   */
  public String top() {
    return isEmpty() ? null : s[0];
  }
    
  /**
   * Fügt dem Stach ein Element hinzu
   * Dabei wird ein hilfsarray erstellt, welches eins länger ist als das eigentliche speicherarray
   * Im Anschluss wird das Speicherarray auf das Hilfsarray mit einem index offset übertagen und der eigentliche Inhalt wird in index 0 geschrieben
   * Zu letzt wird das Speicherarray gleich dem Hilfsarray gesetzt
   */
  public void push(String inhalt) {
    String[] hilf = new String[s.length +1];
    for (int i = 0; i < s.length; i++) {
      hilf[i+1] = s[i];
    }
    hilf[0] = inhalt;
    s = hilf;
    length = s.length;
  }
      
  /**
   * Gibt das letzte Element zurück und entfernt dieses aus dem Array
   * Dabei wird ein hilfsarray erstellt, welches eins kürzer ist als das eigentliche speicherarray
   * Im Anschluss wird das Speicherarray auf das Hilfsarray mit einem index offset übertagen
   * Zu letzt wird das Speicherarray gleich dem Hilfsarray gesetzt
   */
  public String pop() {
    if(!isEmpty()){
      String element = s[0];
      String[] hilf = new String[s.length -1];
      for (int i = 0; i < hilf.length; i++) {
        hilf[i] = s[i+1];
      }
      s = hilf;
      length = s.length;
      return element;
    }
    return null;
  }
  
  public void ausgeben() {
    for (int i = 0; i < s.length; i++) {
      System.out.println(s[i] + " "); 
    }
  }
  
  public int length() {
    return s.length;
  }
      
} 