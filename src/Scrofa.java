import java.util.ArrayList;
import java.util.Date;

public class Scrofa extends Maiale {

    protected final ArrayList<Date> parti;
    protected int numeroParti;
    protected int numeroSvezzati;
    protected double punteggio;

    public Scrofa(Razza razza, Date nascita) {
        super(razza, nascita);
        parti = new ArrayList<>();
    }

    public void aggiungiGravidanza(Gravidanza gravidanza) {
        parti.add(gravidanza.getParto());
    }

    public double punteggio() {
        return punteggio;
    }

}
