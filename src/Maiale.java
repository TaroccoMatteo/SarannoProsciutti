import java.util.Calendar;
import java.util.Date;

public abstract class Maiale {

    private static int CODICE = 0;

    protected final int codice;
    protected final Razza razza;
    protected final Date nascita;
    protected Maiale prossimo;
    private Date fineCarriera;

    public Maiale(Razza razza, Date nascita) {
        this.razza = razza;
        this.nascita = nascita;
        codice = CODICE++;
    }

    public int getCodice() {
        return codice;
    }

    public Razza getRazza() {
        return razza;
    }

    public Date getNascita() {
        return nascita;
    }

    public Date fineCariera(){
        Calendar c = Calendar.getInstance();
        c.setTime(nascita);
        c.add(Calendar.YEAR, 5);
        fineCarriera = c.getTime();
        return null;
    }

}