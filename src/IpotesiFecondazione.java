import java.util.Date;

public class IpotesiFecondazione {

    private final Date data;
    private final ValutaCoppia coppia;
    private IpotesiFecondazione prossimo;

    public IpotesiFecondazione(ValutaCoppia coppia, Date data) {
        this.data = data;
        this.coppia = coppia;
    }

    public ValutaCoppia getCoppia() {
        return coppia;
    }

    public Date getData() {
        return data;
    }

    public IpotesiFecondazione getProssima() {
        return prossimo;
    }

}
