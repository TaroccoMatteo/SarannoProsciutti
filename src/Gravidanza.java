import java.util.Date;

public class Gravidanza extends Coppia {

    protected Date fecondazione;
    protected Date parto;
    protected int natiVivi;
    protected int natiMorti;
    protected Date svezzamento;
    protected Gravidanza prossimo;

    public Date getParto() {
        return parto;
    }

}
