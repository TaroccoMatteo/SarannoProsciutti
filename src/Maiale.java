import java.util.Date;

public abstract class Maiale {

    protected final int codice;
    protected final Razza razza;
    protected final Date nascita;
    protected Maiale prossimo;
    private static int CODICE = 0;

    public Maiale(Razza razza, Date nascita) {
        this.razza = razza;
        this.nascita = nascita;
        codice = CODICE++;
    }

    public int codice() {
        return codice;
    }

}
