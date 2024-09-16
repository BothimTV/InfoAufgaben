public class Zahlen {
    public static void main(String[] args) {
        int[] zahlen = new int[100];
        int i = 0;
        while (i < zahlen.length) {
            zahlen[i] = i + 1;
            i++;
        }

        for (int j = 0; j < zahlen.length; j++) {
            System.out.println(zahlen[j]);
        }
    }
}
