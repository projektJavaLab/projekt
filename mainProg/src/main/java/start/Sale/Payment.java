package start.Sale;

import java.util.Scanner;

import static java.lang.Math.round;

/**
 * Created by Michał on 2015-04-09.
 * Edited by Krzysiek on 2015-05-04.
 */
public class Payment {
    public int type; // 0 -gotowka, 1 - karta 2 - przelew
    public String[] platnosc = new String[3];
    public String[] przelew =  new String[3];
    public String[] PIN = new String[1];
    public String forsa = "";
    public String read = "";
    private String cena_koncowa;

    public int gotowka(String cena_koncowa)
    {
        this.cena_koncowa = cena_koncowa;
        read +=0+",";
        float kasa;
        float reszta;
        System.out.println("Placisz przy kasie" + "\n");
        while(true) {
            System.out.println("Podaj kwote: " + "\n");
            Scanner in = new Scanner(System.in);
            forsa = in.nextLine();
            reszta = Float.parseFloat(forsa) - Float.parseFloat(cena_koncowa);
            if (reszta < 0)
                System.out.println("Naucz sie liczyć debilu!" + "\n");
            else if (reszta > 0) {
                System.out.println("Twoja reszta : " + (float)(Math.round(reszta*100)/100));
                System.out.println("Dziekujemy za zakupy" + "\n");
                break;
            }
        }
        return 0;
    }
    public int karta()
    {
        while(true) {
            System.out.println("Prosze podać numer PIN: " + "\n");
            Scanner in = new Scanner(System.in);
            PIN[0] = in.nextLine();
            if (PIN[0].length() == 4 )
            {
                System.out.println("Dziekujemy za zakupy" + "\n");
                break;
            }
            else
                System.out.println("Błedny numer PIN!" + "\n");
    }
        return 1;
    }

    public int przelew()
    {
        System.out.println("Podaj dane do przelewu"+ "\n" );
        System.out.println("");
        System.out.print("Podaj imie: ");
        Scanner in = new Scanner(System.in);
        przelew[0] = in.nextLine();
        System.out.print("Podaj nazwisko: ");
        in = new Scanner(System.in);
        przelew[1] = in.nextLine();
        while(true) {
            System.out.print("Podaj Numer konta: ");
            in = new Scanner(System.in);
            przelew[2] = in.nextLine();
            if (przelew[2].length() == 26 ) {
                System.out.println("Dziekujemy za zakupy" + "\n");
                break;
            }
            else
                System.out.println("Błedny numer konta!" + "\n");
        }
        return 2;
    }

    public String wybierz_platnosc(String price, float fee)
    {
        while(true) {
            float koszt = (Float.parseFloat(price) + fee);
            System.out.println("\n" + "Całowity kosz z przesyłką: " + Math.round(koszt * 100.0) / 100.0 + "\n");
            System.out.println("Wybierz sposób zapłaty: " + "\n" + "1 - gotówka" + "\n" + "2- karta" + "\n" + "3 - przelew bankowy" + "\n");
            Scanner in = new Scanner(System.in);
            this.type = in.nextInt();
            if (this.type == 1)
            {
                gotowka(Float.toString(koszt));
                break;
            }
            if (this.type == 2)
            {
                karta();
                break;
            }
            if (this.type == 3)
            {
                przelew();
                break;
            }
            else
            {
                System.out.println("Błedny wybór!");
            }
            }
        return null;
    }
}