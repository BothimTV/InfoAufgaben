public class Stoppuhr
{ 
    // Attribute
    private long startZeit, stoppZeit;

    // Konstruktor
    public Stoppuhr()
    {
        startZeit = 0;
        stoppZeit   = 0;
    }

    /*
     * Die Stoppuhr läuft los
     */
    public void start()
    {
        startZeit = System.nanoTime();
    }

    /*
     * Die Stoppuhr stoppt
     */
    public void stopp()
    {
        stoppZeit = System.nanoTime();
    }

    /*
     * Gibt die gestoppte Zeit in Millisekunden zurück
     */
    public double gestoppteZeit()
    {
        return (stoppZeit - startZeit)/1000000;
    }
}
