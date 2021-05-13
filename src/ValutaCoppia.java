public class ValutaCoppia extends Coppia {

    private int fecondazioni;
    private int suinetti;

    public ValutaCoppia(Gravidanza gravidanza) {
        super(gravidanza.scrofa, gravidanza.verro);
        suinetti = gravidanza.natiVivi;
        fecondazioni = gravidanza.scrofa.numeroParti;
    }

    public double punteggio() {
        return 0;
    }

    public Coppia getProssima() {
        return prossimo;
    }

}
