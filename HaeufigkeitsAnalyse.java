import java.util.Scanner;

public class HaeufigkeitsAnalyse {

    public static void main(String[] args) {
        String text1 = getText();
        double[] analyse1 = analyse(text1);
        decodeCaesar(analyse1, text1);
    }

    public static String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe den Text ein");
        String text = scanner.nextLine().toUpperCase();
        scanner.close();
        return text;
    }

    public static double[] analyse(String text) {
        int charsWithoutSpace = 0;

        int[] chance = new int['Z' + 1];
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i);
            if (index >= 'A' && index <= 'Z') {
                chance[index] += 1;
                charsWithoutSpace += 1;
            }
        }

        double[] percentages = new double['Z' + 1];
        for (int i = 'A'; i <= 'Z'; i++) {
            double percentage = (double) chance[i] / charsWithoutSpace;
            System.out.println((char) i + ": " + (percentage * 100) + "; ");
            percentages[i] = percentage * 100;
        }
        return percentages;
    }

    public static void decodeCaesar(double[] analyse, String text) {
        double highestPercentage = 0;
        char highestChar = 'A';
        for (int i = 'A'; i < analyse.length; i++) {
            if (analyse[i] > highestPercentage) {
                highestPercentage = analyse[i];
                highestChar = (char) i;
            }
        }
        int offset = 'E' - highestChar;
        System.out.println("Offset: " + offset);
        String decoded = "";
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i);
            if (index >= 'A' && index <= 'Z') {
                index += offset;
                if (index > 'Z') {
                    index = index - 26;
                } else if (index < 'A') {
                    index = index + 26;
                }
                decoded += (char) index;
            } else {
                decoded += text.charAt(i);
            }
        }
        System.out.println(decoded);
    }

}