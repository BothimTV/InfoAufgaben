import java.util.Scanner;

public class HaeufigkeitsAnalyse {

    public static void main(String[] args) {
        analyse();
    }

    public static void analyse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe den Text ein");
        String text = scanner.nextLine().toUpperCase();
        int charsWithoutSpace = 0;
        scanner.close();

        int[] chance = new int['Z' + 1];
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i);
            if (index >= 'A' && index <= 'Z') {
                chance[index] += 1;
                charsWithoutSpace += 1;
            }
        }

        for (int i = 'A'; i <= 'Z'; i++) {
            double percentage = (double) chance[i] / charsWithoutSpace;
            System.out.println((char) i + ": " + (percentage * 100) + "; ");
        }
    }

}