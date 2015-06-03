package start.dynamic;

import start.baza.danych;
import start.output;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Additionals {
    // cena
    public static double Price = 0;
    // moc
    int Power = 0;
        // tablica przechowująca indexy do częsci
    // 0-procesor, 1-płyta główna, 2-ram, 3-karta graficzna, 4-obudowa, 5-dysk, 6-akcesoria, 7-monitory, 8-systemy, 9-oprogramowanie, 10-chłodzenie, 11-karty sieciowe, 12-karty dźwiękowe, 13-napęd, 14-zasilacz
    public static String[] Konf= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "" };
    
    

    // wybór akcesoriów
    public int ID2() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        try
        {
            id=Integer.parseInt(in.next());
        }
        catch (NumberFormatException n)
        {
            System.out.println("Niepoprawne dane !!!");
            return ID2();
        }
        return id-1;
    }
    



    // AKCESORIA
    public String Acc(double maxPrice) {
        String Sid="";
        System.out.println("ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ");
        output.writeStringTab(danych.ACCESSORY);
        int temp;
        double temp2=0;
        while (true){
            temp = ID2();
            while(danych.ACCESSORY.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID2();
            }
            if(temp==-1) break;
            if(maxPrice-temp2>Double.parseDouble(danych.ACCESSORY[temp][2]))
            {
                Sid += temp;
                Sid += ",";
                Sid += Double.parseDouble(danych.ACCESSORY[temp][2]);
                temp2 += Double.parseDouble(danych.ACCESSORY[temp][2]);
                Sid += ";";
            }
            else
            {
                System.out.println("Wybrane akcesorium jest zbyt drogie");
            }
        }
        return Sid;
    }




    // KARTA DŹWIĘKOWA
    public String Sou(double maxPrice) {
        String Sid="";
        System.out.println("ID || PRODUCENT || MODEL || SNR || WYJSCIE OPTYCZNE || WZMACNIACZ SLUCHAWKOWY || STAN MAG. || CENA");
        output.writeStringTab(danych.SOUNDCARD);
        int temp;
        double temp2=0;
        while (true){
            temp = ID2();
            while(danych.SOUNDCARD.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID2();
            }
            if(temp==-1) break;
            if(maxPrice-temp2>Double.parseDouble(danych.SOUNDCARD[temp][7]))
            {
                Sid += temp;
                Sid += ",";
                Sid += Double.parseDouble(danych.SOUNDCARD[temp][7]);
                temp2 += Double.parseDouble(danych.SOUNDCARD[temp][7]);
                Sid += ";";
            }
            else
            {
                System.out.println("Wybrane akcesorium jest zbyt drogie");
            }
        }
        return Sid;
    }





    // NAPĘDY
    public String Dr(double maxPrice) {
        String Sid="";
        System.out.println("ID || NAZWA || TYP || TECHNOLOGIA || INTERFEJS || STAN MAG. || CENA");
        output.writeStringTab(danych.DRIVE);
        int temp;
        double temp2=0;
        while (true){
            temp = ID2();
            while(danych.DRIVE.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID2();
            }
            if(temp==-1) break;
            if(maxPrice-temp2>Double.parseDouble(danych.DRIVE[temp][6]))
            {
                Sid += temp;
                Sid += ",";
                Sid += Double.parseDouble(danych.DRIVE[temp][6]);
                temp2 += Double.parseDouble(danych.DRIVE[temp][6]);
                Sid += ";";
            }
            else
            {
                System.out.println("Wybrane akcesorium jest zbyt drogie");
            }
        }
        return Sid;
    }
    




    // funkcja główna
    public String[] Start(double maxPrice) {


        double Price3=maxPrice;
        System.out.println();
        System.out.println();
        System.out.println("Pozostało Ci: "+Price3);
        System.out.println("Wybierz teraz dodatkowe akcesoria\n");

        String Acc = Acc(Price3);
        StringTokenizer st6 = new StringTokenizer(Acc, ",;");
        while (st6.hasMoreTokens()) {
            Konf[6] += st6.nextToken() + ",";
            Price += Double.parseDouble(st6.nextToken());
        }
        Price3-=Price;

        System.out.println("\nPozostało Ci: "+Price3);
        String Sou = Sou(Price3);
        StringTokenizer st12 = new StringTokenizer(Sou, ",;");
        while (st12.hasMoreTokens()) {
            Konf[12] += st12.nextToken() + ",";
            Price += Double.parseDouble(st12.nextToken());
            Power += 20;
        }
        Price3-=Price;

        System.out.println("\nPozostało Ci: "+Price3);
        String Dr = Dr(Price3);
        StringTokenizer st13 = new StringTokenizer(Dr, ",;");
        while (st13.hasMoreTokens()) {
            Konf[13] += st13.nextToken() + ",";
            Price += Double.parseDouble(st13.nextToken());
            Power += 25;
        }
        Price3-=Price;


        // wypisanie konfiguracji
        //System.out.println("Konfiguracja: "+Konf[0]+"|"+Konf[1]+"|"+Konf[2]+"|"+Konf[3]+"|"+Konf[4]+"|"+Konf[5]+"|"+Konf[6]+"|"+Konf[7]+"|"+Konf[8]+"|"+Konf[9]+"|"+Konf[10]+"|"+Konf[11]+"|"+Konf[12]+"|"+Konf[13]+"|"+Konf[14]);
        System.out.println();
        System.out.println("Cena (Akcesoria): "+Price);
        System.out.println("Moc (Akcesoria): "+Power);
        String [] RET = new String[17];
        RET[15] = String.valueOf(Price);
        RET[16] = String.valueOf(Power);
        for(int i=0; i<15; i++)
            RET[i]=Konf[i];
        return RET;
    }

}
