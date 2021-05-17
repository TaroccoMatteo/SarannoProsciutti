import java.util.ArrayList;
import java.util.Date;

public class Scrofa extends Maiale {

    protected final ArrayList<Gravidanza> parti;
    protected int numeroParti;
    protected int numeroNati;
    protected int numeroSvezzati;

    public Scrofa(Razza razza, Date nascita) {
        super(razza, nascita);
        parti = new ArrayList<>();
    }

    public void aggiungiGravidanza(Gravidanza gravidanza) {
        parti.add(gravidanza);
    }

    public double getPunteggio() throws Exception {
        if(numeroParti >= 2)
            return (numeroParti+numeroSvezzati)*(/*METTERE NUMERO GIORNI TRA PRIMO E ULTIMO PARTO*/766*numeroNati);
        throw new Exception();
    }
    public Verro scegliVerro(Maiale maiale,Coppia coppia,IpotesiFecondazione ipotesiFecondazione){


    }

}