public class Patient {

    private String name;
    private String kasse;
    private int priorität;

    public Patient(String pName, String pKasse, int pPriorität) {
        name = pName;
        kasse = pKasse;
        priorität = pPriorität;
    }

    public String getName() {
        return name;
    }

    public String getKasse() {
        return kasse;
    }

    public int getPriorität() {
        return priorität;
    }

}