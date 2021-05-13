public class ValutaCoppia extends Coppia {

    private final int fecondazioni;
    private final int suinetti;

    public ValutaCoppia(Gravidanza gravidanza) {
        super(gravidanza.scrofa, gravidanza.verro);
        suinetti = gravidanza.natiVivi;
        fecondazioni = gravidanza.scrofa.numeroParti;
    }

    public double getPunteggio() {
        return suinetti * fecondazioni;
    }

    public Coppia getProssima() {
        return prossimo;
    }

}
