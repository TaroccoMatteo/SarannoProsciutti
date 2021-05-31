import java.util.ArrayList;

public class Allevamento {

    private final ArrayList<Maiale> maiali;
    private final ArrayList<Gravidanza> gravidanze;
    private final ArrayList<Coppia> coppie;

    public Allevamento() {
        maiali = new ArrayList<>();
        gravidanze = new ArrayList<>();
        coppie = new ArrayList<>();
    }

    public void addMaiale(Maiale maiale) {
        maiali.add(maiale);
    }

    public void addGravidanza(Gravidanza gravidanza) {
        gravidanze.add(gravidanza);
    }

    public void addCoppia(Coppia coppia) {
        coppie.add(coppia);
    }

    public Maiale find(int ID){
        for(int i=0; i<maiali.size(); i++){

        }

    }

    @Override
    public String toString() {
        return "Allevamento{" +
                "maiali =" + maiali +
                ", gravidanze =" + gravidanze +
                ", coppie =" + coppie +
                '}';
    }
}