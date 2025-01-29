public class DynIntReihungTest {
  public static void main(String[] args) {
    DynIntReihung reihung = new DynIntReihung();

    reihung.append(1);
    reihung.append(2);
    reihung.append(3);
    reihung.append(4);
    reihung.append(5);

    System.out.println(reihung.getItem(0));
    System.out.println(reihung.getItem(1));
    System.out.println(reihung.getItem(2));
    System.out.println(reihung.getItem(3));
    System.out.println(reihung.getItem(4));

    reihung.insertAt(2, 6);

    System.out.println(reihung.getItem(0));
    System.out.println(reihung.getItem(1));
    System.out.println(reihung.getItem(2));
    System.out.println(reihung.getItem(3));
    System.out.println(reihung.getItem(4));
    System.out.println(reihung.getItem(5));

    reihung.delete(3);

    System.out.println(reihung.getItem(0));
    System.out.println(reihung.getItem(1));
    System.out.println(reihung.getItem(2));
    System.out.println(reihung.getItem(3));
    System.out.println(reihung.getItem(4));

    System.out.println(ReihungDurchsuchen(reihung, 6));
    System.out.println(ReihungDurchsuchen(reihung, 10));
  }

  public static int ReihungDurchsuchen(DynIntReihung reihung, int element) {
    for (int i = 0; i < reihung.getLength(); i++) {
      if (reihung.getItem(i) == element) {
        return i;
      }
    }
    return -1;
  }
}