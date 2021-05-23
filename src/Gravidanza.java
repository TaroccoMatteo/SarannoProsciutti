import java.util.Date;
import java.util.GregorianCalendar;

public class Gravidanza extends Coppia {

    protected GregorianCalendar fecondazione;
    protected GregorianCalendar parto;
    protected int natiVivi;
    protected int natiMorti;
    protected GregorianCalendar svezzamento;
    protected int svezzati;
    private Gravidanza prossimo;

    public Gravidanza(Scrofa scrofa, Verro verro) {
        super(scrofa, verro);
    }

    public GregorianCalendar getFecondazione() {
        return fecondazione;
    }

    public GregorianCalendar getParto() {
        return parto;
    }

    public int getNatiVivi() {
        return natiVivi;
    }

    public int getNatiMorti() {
        return natiMorti;
    }

    public GregorianCalendar getSvezzamento() {
        return svezzamento;
    }

    public int getSvezzati() {
        return svezzati;
    }

    public Gravidanza getProssimo() {
        return prossimo;
    }

}