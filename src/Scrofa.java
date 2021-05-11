import java.util.ArrayList;
import java.util.Date;

public class Scrofa extends Maiale {

    private final ArrayList<Date> parti;
    private int numeroParti;
    private int numeroSvezzati;
    private double punteggio;

    public Scrofa(Razza razza, Date nascita) {
        super(razza, nascita);
        parti = new ArrayList<>();
    }

    public void aggiungiGravidanza(Gravidanza gravidanza) {
        parti.add(gravidanza.dataParto());
    }

    public double punteggio() {
        return punteggio;
    }

}
