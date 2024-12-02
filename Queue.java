
public class Queue {
    private Patient[] q;

    public Queue() {
        q = new Patient[0];
    }

    public boolean isEmpty() {
        if (q.length == 0) {
            return true;
        }
        return false;
    }

    public Patient head() {
        if (!isEmpty()) {
            return q[0];
        } else {
            return null;
        }
    }

    public void enqueue(Patient data) {
        Patient[] hilf = new Patient[q.length + 1];
        for (int i = 0; i < q.length; i++) {
            hilf[i] = q[i];
        } // end of for
        hilf[q.length] = data;
        q = hilf;
    }

    public Patient dequeue() {
        if (!isEmpty()) {
            Patient temp = q[0];
            Patient[] hilf = new Patient[q.length - 1];
            for (int i = 0; i < hilf.length; i++) {
                hilf[i] = q[i + 1];
            }
            q = hilf;
            return temp;
        }
        return null;
    }

} // Ende der Klasse Queue
