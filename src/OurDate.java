import java.util.GregorianCalendar;
import java.util.Date;

public class OurDate {
    public GregorianCalendar dataUno = null;
    public GregorianCalendar dataDue = null;


    public OurDate(GregorianCalendar dataUno, GregorianCalendar dataDue) {
        this.dataUno = dataUno;
        this.dataDue = dataDue;
    }

    public double differenzaGiorni(GregorianCalendar dataUno, GregorianCalendar dataDue){
        long dataUnoMilli = dataUno.getTimeInMillis();
        long dataDueMilli = dataDue.getTimeInMillis();
        long diff2 = 0; // differenza effettiva in ms

        // controllo se data1 e' > di data2
        if (dataUnoMilli > dataDueMilli){
            // differenza provvisoria in ms
            long diff1 = dataUnoMilli - dataDueMilli;
            diff2 = diff1;
        }
        else{
            long diff1 = dataDueMilli - dataUnoMilli;
            diff2 = diff1;
        }
        double diffGiorni = diff2 / 86400000; //conversione da millisecondi a giorni
        return diffGiorni;
    }
}
