public class Stack{
  private int[] s;
 
  public Stack() {
    s = new int[0];
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
  public int top(){
    return isEmpty() ? 0 : s[0];
  }
    
  /**
   * Fügt dem Stack ein Element hinzu
   * Dabei wird ein hilfsarray erstellt, welches eins länger ist als das eigentliche speicherarray
   * Im Anschluss wird das Speicherarray auf das Hilfsarray mit einem index offset übertagen und der eigentliche Inhalt wird in index 0 geschrieben
   * Zu letzt wird das Speicherarray gleich dem Hilfsarray gesetzt
   */
  public void push(int inhalt){
    int[] hilf = new int[s.length +1];
    for (int i = 0; i < s.length; i++) {
      hilf[i+1] = s[i];
    }
    hilf[0] = inhalt;
    s = hilf;
  }
      
  /**
   * Gibt das letzte Element zurück und entfernt dieses aus dem Array
   * Dabei wird ein hilfsarray erstellt, welches eins kürzer ist als das eigentliche speicherarray
   * Im Anschluss wird das Speicherarray auf das Hilfsarray mit einem index offset übertagen
   * Zu letzt wird das Speicherarray gleich dem Hilfsarray gesetzt
   */
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