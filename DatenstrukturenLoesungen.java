public class DatenstrukturenLoesungen {

    public static void main(String[] args) {
        // Dynamisches Array - Aufgaben
        System.out.println("Dynamisches Array - Aufgaben");
        DynReihung dynArray = new DynReihung();
        dynArray.append(10);
        dynArray.append(20);
        dynArray.append(30);

        System.out.println("Element an Index 0: " + dynArray.getItem(0));
        System.out.println("Element an Index 2: " + dynArray.getItem(2));
        System.out.println("Länge: " + dynArray.getLength());

        dynArray.insertAt(1, 15);
        dynArray.setItem(3, 25);

        for (int i = 0; i < dynArray.getLength(); i++) {
            System.out.println("Element an Index " + i + ": " + dynArray.getItem(i));
        }
        System.out.println("Länge: " + dynArray.getLength());

        // Stack - Aufgaben
        System.out.println("\nStack - Aufgaben");
        Stack stack = new Stack();

        // Queue - Aufgaben
        System.out.println("\nQueue - Aufgaben");
        Queue queue = new Queue();

    }
}