import java.util.Date;

public class Patient {

    private String name;
    private String kasse;
    private int priorität;
    private Date ankunftszeit;

    public Patient(String pName, String pKasse, int pPriorität) {
        name = pName;
        kasse = pKasse;
        priorität = pPriorität;
        ankunftszeit = new Date();
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

    public Date getAnkunftszeit() {
        return ankunftszeit;
    }

}