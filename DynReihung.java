public class DynReihung {

    private int length;
    private Element head;

    /**
     * Eine leere dynamische Reihung wird angelegt.
     */
    public DynReihung() {
        length = 0;
        head = null;
    }

    /**
     * Es wird geprüft, ob die dynamische Reihung leer ist.
     *
     * @return Wenn die dyn. Reihung kein Element enthält, wird der Wert true
     *         zurückgegeben, sonst der Wert false.
     */
    public boolean isEmpty() {
        return length == 0;
    }

    public int getItem(int index) {
        if (length > index) {
            Element current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
        return -1; // Fehlerfall: Index ungültig
    }

    public void append(int data) {
        if (!isEmpty()) {
            getElement(length - 1).next = new Element(data);
        } else {
            head = new Element(data);
        }
        length++;
    }

    public void insertAt(int index, int data) {
        if (index < length && index > 0) { // Es wird mittig eingefügt.
            Element n = new Element(data);
            Element temp = getElement(index);
            getElement(index - 1).next = n;
            n.next = temp;
            length++;
        } else if (index == 0 && !isEmpty()) { // Es wird vorne eingefügt.
            Element temp = head;
            head = new Element(data);
            head.next = temp;
            length++;
        } else if (index == length) { // Es wird am Ende hinzugefügt.
            append(data);
        }
    }

    /**
     * Der Inhalt des Elements an der Position index wird durch den übergebenen
     * Inhalt ersetzt.
     *
     * @param index Die Position des Elements.
     * @param data  Der neue Inhalt.
     */
    public void setItem(int index, int data) {
        if (index >= 0 && index < length) {
            getElement(index).data = data;
        }
    }

    /**
     * Das Element an der Position index wird gelöscht.
     *
     * @param index Die Position des Elements.
     */
    public void delete(int index) {
        if (index == 0 && length > 0) { // Es wird das erste Element gelöscht.
            head = head.next;
            length--;
        } else if (index > 0 && index < length) { // Es wird nicht vorne gelöscht.
            getElement(index - 1).next = getElement(index - 1).next.next;
            length--;
        }
    }

    /**
     * Die Länge der dynamischen Reihung wird zurückgegeben.
     *
     * @return Die Länge der dynamischen Reihung.
     */
    public int getLength() {
        return length;
    }

    private Element getElement(int index) {
        if (index < length) {
            Element current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
        return null; // Fehlerfall: Index ungültig
    }

    // Klasse Element zur internen Verwaltung der einzelnen Elemente der dynamischen
    // Reihung
    private class Element {
        public int data;
        public Element next;

        public Element(int d) {
            data = d;
            next = null;
        }
    }
}
