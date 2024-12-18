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

        dynArray.delete(2);
        System.out.println("Das Element 10 ist im Array an der Position: " + dynArray.findInt(10));
        System.out.println("Das Element 20 ist im Array an der Position: " + dynArray.findInt(20));

        System.out.println(" -- Sortieren (Absteigend) -- ");
        dynArray.sort(false);
        for (int i = 0; i < dynArray.getLength(); i++) {
            System.out.println("Element an Index " + i + ": " + dynArray.getItem(i));
        }

        System.out.println(" -- Sortieren (Aufsteigend) -- ");
        dynArray.sort(true);
        for (int i = 0; i < dynArray.getLength(); i++) {
            System.out.println("Element an Index " + i + ": " + dynArray.getItem(i));
        }

        // Stack - Aufgaben
        System.out.println("\nStack - Aufgaben");
        Stack stack = new Stack();

        stack.push("Apfel");
        stack.push("Banane");
        stack.push("Kirsche");
        System.out.println("Top: " + stack.top());

        System.out.println("Pop: " + stack.pop());
        stack.push("Orange");
        System.out.println("Stack leer? " + stack.isEmpty());

        // Queue - Aufgaben
        System.out.println("\nQueue - Aufgaben");
        Queue queue = new Queue();

    }
}