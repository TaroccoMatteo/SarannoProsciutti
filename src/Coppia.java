public class Coppia {

    protected final Scrofa scrofa;
    protected Verro verro;
    protected Coppia prossimo;

    public Coppia(Scrofa scrofa, Verro verro) {
        this.scrofa = scrofa;
        this.verro = verro;
    }

    public Coppia(Verro verro, Scrofa scrofa) {
        this.scrofa = scrofa;
        this.verro = verro;
    }

    public Scrofa getScrofa() {
        return scrofa;
    }

    public Verro getVerro() {
        return verro;
    }

}