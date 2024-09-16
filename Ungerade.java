public class Ungerade {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        
        while (oddNumbers[oddNumbers.length - 1] == 0 || evenNumbers[evenNumbers.length - 1] == 0) {
            for (int i = 0; i < evenNumbers.length; i++) {
                evenNumbers[i] = i * 2;
            }
            
            for (int i = 0; i < oddNumbers.length; i++) {
                oddNumbers[i] = i * 2 + 1;
            }
            
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);
        }

        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}
