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
        return menu
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int menu;
        menu = menu();
        int select;
        if(menu == 1){

            do{
                System.out.println("selezionare la razza del maiale (1 scrofa, 2 verro)");
                select = inp.nextInt();
            }while(select != 1 && select != 2);
            if(select == 1){
                String razza;
                do{
                    System.out.println("Inserire la razza:");
                    razza = inp.nextLine();
                }while(razza != "LW" && razza != "L" && razza != "D");
                /*
                String d_nasc = "05/09/2020";
                try {
                    this.data_nasc = new
                            SimpleDateFormat("dd/MM/yyyy").parse(d_nasc);
                } catch (ParseException ex) {
                    this.data_nasc= new Date(0);//1 1 1970
                }*/
                if(razza == "LW"){
                    Scrofa s1 = new Scrofa(Razza.LW,);
                }
                if(razza == "L"){
                    Scrofa s1 = new Scrofa(Razza.L,"05/09/2021");
                }
                if(razza == "D"){
                    Scrofa s1 = new Scrofa(Razza.D,"05/09/2021");
                }

            }

        }

    }
}