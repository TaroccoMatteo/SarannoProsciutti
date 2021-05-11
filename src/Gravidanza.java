import java.util.Date;

public class Gravidanza {

    private Date fecondazione;
    private Date parto;
    private int natiVivi;
    private int natiMorti;
    private Date svezzamento;
    private Gravidanza prossimo;

    public Date dataParto() {
        return parto;
    }

}
