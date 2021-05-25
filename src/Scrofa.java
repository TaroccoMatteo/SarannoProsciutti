import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

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
        if(numeroParti >= 2) {
            GregorianCalendar data1 = gravidanze.get(gravidanze.size() - 1).parto;
            GregorianCalendar data2 = gravidanze.get(gravidanze.size() - 2).parto;
            OurDate diff = new OurDate(data1, data2);
            return (numeroParti + numeroSvezzati) * (diff.differenzaGiorni() / 766 * numeroNati);
        }
        throw new Exception();
    }

    public Coppia scegliVerro(Verro verro){
        return new Coppia(this, verro);
    }

}
