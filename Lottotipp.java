public class Lottotipp {

    public static void main(String[] args) {
        int[] tipp = new int[6];

        tipp[0] = 7;
        tipp[1] = 12;
        tipp[2] = 25;
        tipp[3] = 28;
        tipp[4] = 33;
        tipp[5] = tipp[0] + tipp[1];

        System.out.println(tipp[5]);

        // Aufgabe 1
        /**
         * a)
         * Die Länge beträgt 6, da das Array 6 Elemente hat.
         * 
         * b)
         * Der kleinste index ist 0 und der größte index ist 5.
         * 
         * c)
         * Allgemein ist der kleinste index 0 und der größte index n-1.
         * 
         * d)
         * Der index mit dem größten Element ist 4.
         * 
         * e)
         * Die Ausgabe ist 19.
         */

        // Aufgabe 2 e)

        tipp[3] = -50;

        System.out.println(tipp[0]);
        System.out.println(tipp[3] + 100);

    }
    
}