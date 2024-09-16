public class Arrays {
    public static void main(String[] args) {
        int[] tipp = { 3, 5, 34, 2, 78, 34, 6, 42};

        for (int i = 0; i < tipp.length; i++) {
            System.out.println(tipp[i]);
        }

        // Aufgabe 2

        int[] zahlen = new int[20];

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = 42;
        }

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
