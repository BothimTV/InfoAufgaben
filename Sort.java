public class Sort {
    public static void main(String[] args) {

        int[] arr = { 4, 39, 4, 0, 21, 8, 2 };
        boolean läuft = true;

        while (läuft) {
            boolean änderung = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    änderung = true;
                }
            }
            if (!änderung) {
                läuft = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}