import java.util.ArrayList;
import java.util.Date;

public class Scrofa extends Maiale {

    protected final ArrayList<Gravidanza> gravidanze;
    protected int numeroParti;
    protected int numeroNati;
    protected int numeroSvezzati;

    public Scrofa(Razza razza, Date nascita) {
        super(razza, nascita);
        gravidanze = new ArrayList<>();
    }

    public void aggiungiGravidanza(Gravidanza gravidanza) {
        gravidanze.add(gravidanza);
    }

    public double getPunteggio() throws Exception {
        if(numeroParti >= 2)
            return (numeroParti+numeroSvezzati)*(/*METTERE NUMERO GIORNI TRA PRIMO E ULTIMO PARTO*/766*numeroNati);
        throw new Exception();
    }

    public Coppia scegliVerro(Verro verro){
        return new Coppia(this, verro);
    }

    @Override
    public String toString() {
        return "Scrofa{" +
                "codice=" + codice +
                ", razza=" + razza +
                ", nascita=" + nascita +
                ", prossimo=" + prossimo +
                ", gravidanze=" + gravidanze +
                ", numeroParti=" + numeroParti +
                ", numeroNati=" + numeroNati +
                ", numeroSvezzati=" + numeroSvezzati +
                '}';
    }
}
