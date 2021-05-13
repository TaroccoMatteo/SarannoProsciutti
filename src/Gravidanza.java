import java.util.Date;

public class Gravidanza extends Coppia {

    protected Date fecondazione;
    protected Date parto;
    protected int natiVivi;
    protected int natiMorti;
    protected Date svezzamento;
    protected int svezzati;
    private Gravidanza prossimo;

    public Gravidanza(Scrofa scrofa, Verro verro) {
        super(scrofa, verro);
    }

    public Date getFecondazione() {
        return fecondazione;
    }

    public Date getParto() {
        return parto;
    }

    public int getNatiVivi() {
        return natiVivi;
    }

    public int getNatiMorti() {
        return natiMorti;
    }

    public Date getSvezzamento() {
        return svezzamento;
    }

    public int getSvezzati() {
        return svezzati;
    }

    public Gravidanza getProssimo() {
        return prossimo;
    }

}