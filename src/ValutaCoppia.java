public class ValutaCoppia {
    private int Fecondazioni;
    private int suinetti;
    

    //costruttori
    public ValutaCoppia(){
        this.Fecondazioni = 0;
        this.suinetti = 0;

    }
    public ValutaCoppia(int Fecondazioni, int suinetti){
        this.Fecondazioni = Fecondazioni;
        this.suinetti = suinetti;
    }
    public ValutaCoppia(Coppia c){
        this.Fecondazioni = c.getFecondazioni;
        this.suinetti = c.getSuinetti;
    }
}
