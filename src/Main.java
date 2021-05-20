import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static int menu(){
        Scanner inp = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Selezionare una voce dal menù: ");
            System.out.println("1 --> aggiungi maiale");
            menu = inp.nextInt();
        }while(menu != 0 && menu != 1 && menu != 2 && menu != 3 && menu != 4);
        return (menu);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int menu;
        menu = menu();
        int select;
        //se non esiste l'allevamento nel csv viene creato
        Allevamento A1 = new Allevamento();

        if(menu == 1){

            do{
                System.out.println("selezionare la razza del maiale (1 scrofa, 2 verro)");
                select = inp.nextInt();
            }while(select != 1 && select != 2);
            if(select == 1){
                inp.nextLine();
                String razza;
                do{
                    System.out.println("Inserire la razza(LW/L/D):");
                    razza = inp.nextLine();
                    System.out.println(razza);
                }while(!razza.equals("LW") && !razza.equals("L") && !razza.equals("D"));

                String d_nasc = "05/09/2020";
                //check variabile

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

                System.out.println(A1.toString());

            }

        }

    }
}