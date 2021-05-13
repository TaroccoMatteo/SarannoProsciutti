public class Coppia {

    protected final Scrofa scrofa;
    protected final Verro verro;
    protected Coppia prossimo;

    public Coppia(Scrofa scrofa, Verro verro) {
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
