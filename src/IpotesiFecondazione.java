import java.util.Date;

public class IpotesiFecondazione {
    private Date data;
    private ValutaCoppia coppia;
    private IpotesiFecondazione prossima;
    

    //costruttori
    public IpotesiFecondazione(){
        this.data = null;
        this.coppia = null;
        this.prossima = null;
    }
    public IpotesiFecondazione(Date data, ValutaCoppia coppia, IpotesiFecondazione prossima){
        this.data = data;
        this.coppia = coppia;
        this.prossima = prossima;
    }
    public IpotesiFecondazione(IpotesiFecondazione i){
        this.data = i.getData;
        //this.coppia = i.getCoppia;
        this.prossima = i.getProssima;
    }
}
