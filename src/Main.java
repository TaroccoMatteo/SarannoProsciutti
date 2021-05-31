import java.util.Date;
import java.util.Scanner;

public class Main {

    public static int menu(){
        Scanner inp = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Selezionare una voce dal menù: ");
            System.out.println("1 --> aggiungi maiale");
            System.out.println("2 --> aggiungi coppia");
            System.out.println("3 --> aggiungi gravidanza");
            menu = inp.nextInt();
        }while(menu != 1 && menu != 2 && menu != 3);
        return (menu);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner inp = new Scanner(System.in);
            int menu;
            menu = menu();
            int select;
            Allevamento A1 = new Allevamento();
            if(menu == 1) {
                do {
                    System.out.println("selezionare la razza del maiale (1 scrofa, 2 verro)");
                    select = inp.nextInt();
                } while(select != 1 && select != 2);
                inp.nextLine();
                if (select == 1) {
                    String razza;
                    do{
                        System.out.println("Inserire la razza(LW/L/D):");
                        razza = inp.nextLine();
                        System.out.println(razza);
                    }while(!razza.equals("LW") && !razza.equals("L") && !razza.equals("D"));

                    if(razza.equals("LW")){
                        System.out.println("salve");
                        A1.addMaiale(new Scrofa(Razza.LW,new Date(0)));
                    }
                    if(razza.equals("L")){
                        A1.addMaiale(new Scrofa(Razza.L,new Date(0)));
                    }
                    if(razza.equals("D")){
                        A1.addMaiale(new Scrofa(Razza.D,new Date(0)));
                    }
                } else {
                    String razza;
                    do {
                        System.out.println("Inserire la razza(LW/L/D):");
                        razza = inp.nextLine();
                        System.out.println(razza);
                    } while (!razza.equals("LW") && !razza.equals("L") && !razza.equals("D"));
                    if (razza.equals("LW")) {
                        System.out.println("salve");
                        A1.addMaiale(new Verro(Razza.LW, new Date(0)));
                    }
                    if (razza.equals("L")) {
                        A1.addMaiale(new Verro(Razza.L, new Date(0)));
                    }
                    if (razza.equals("D")) {
                        A1.addMaiale(new Verro(Razza.D, new Date(0)));
                    }
                }
            } else if(menu == 2) {
                System.out.println("inserisci ID scrofa");
                int id1 = inp.nextInt();
                System.out.println("inserisci ID verro");
                int id2 = inp.nextInt();
                A1.addCoppia(new Coppia((Scrofa)A1.find(id1), (Verro)A1.find(id2)));
            } else {
                System.out.println("inserisci ID scrofa");
                int id1 = inp.nextInt();
                System.out.println("inserisci ID verro");
                int id2 = inp.nextInt();
                A1.addGravidanza(new Gravidanza((Scrofa)A1.find(id1), (Verro)A1.find(id2)));
            }
        }
    }
}