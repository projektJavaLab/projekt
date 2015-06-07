package start.dynamic;

import start.configuration.Adds;
import start.baza.danych;
import start.configuration.Processor;
import start.output;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Home extends Main {
    // cena
    public static double Price = 0;
    // moc
    int Power = 0;
    String Socket="";
    // tablica przechowująca indexy do częsci
    // 0-procesor, 1-płyta główna, 2-ram, 3-karta graficzna, 4-obudowa, 5-dysk, 6-akcesoria, 7-monitory, 8-systemy, 9-oprogramowanie, 10-chłodzenie, 11-karty sieciowe, 12-karty dźwiękowe, 13-napęd, 14-zasilacz
    public static String[] Konf= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "" };
    // tablic możliwych procesorów
    public int [] Proc = new int[]{7,8,9,10,11,12,13,14,15};
    // tablica możliwych RAM
    public int [] Ram = new int[]{1,5,6,7,8,9,10};
    // tablica możliwych kart graficznych
    public int [] GraphCard = new int[]{1,2,3,4,5,6,7,8,9,10};
    // tablica możliwych kart sieciowych
    public int [] NiC = new int[]{1,2,3,4,5,6,7};
    // tablica możliwych systemów operacyjnych
    public int [] OS = new int[]{1,2,3,4,7,8};
    // tablica możliwych płyt głównych
    public int [] MB = new int[]{1,2,3,4,5,6,7,8,9,10};
    // tablica możliwych dysków
    public int [] HD = new int[]{1,2,3,4,5,6,7,8,9,10};
    // tablica możliwych zasilaczy
    public int [] PS = new int[]{1,2,3,4,5,6,7,8,9,10};
    // tablica możliwych obudów
    public int [] CA = new int[]{1,2,3,4,5,6,7,8,9};

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



    public int ID(double maxPrice, int []tab, String [][]tab2, int C, double P) {
        int id=0;
        // wybranie odpowiedniego ID
        boolean ok=true;
        Random r = new Random();
        int a;
        while(ok)
        {
            a=r.nextInt(tab2.length);
            if(Double.parseDouble(tab2[a][C])<maxPrice*P)
            {
                for(int i=0; i<tab.length; i++)
                {
                    if(Integer.parseInt(tab2[a][0])==tab[i])
                    {
                        ok=false;
                        id=Integer.parseInt(tab2[a][0]);
                    }
                }
            }
        }
        //
        return id-1;
    }



    public String Sof(double maxPrice) {
        String Sid="";
        System.out.println("ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ");
        output.writeStringTab(danych.SOFTWARE);
        int temp;
        double temp2=0;
        while (true){
            temp = ID2();
            while(danych.SOFTWARE.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID2();
            }
            if(temp==-1) break;
            if(maxPrice-temp2>Double.parseDouble(danych.SOFTWARE[temp][2]))
            {
                Sid += temp;
                Sid += ",";
                Sid += Double.parseDouble(danych.SOFTWARE[temp][2]);
                temp2 += Double.parseDouble(danych.SOFTWARE[temp][2]);
                Sid += ";";
            }
            else
            {
                System.out.println("Wybrane akcesorium jest zbyt drogie");
            }
        }
        return Sid;
    }




    public double Price(int id) {
        String p = danych.PROCESSOR[id][7];
        return Double.parseDouble(p);
    }
    public int Power(int id) {
        String p = danych.PROCESSOR[id][8];
        return Integer.parseInt(p);
    }
    public String Socket(int id){
        return danych.PROCESSOR[id][5];
    }

    public String Proc(double maxPrice){
        String Sid="";
        int temp;
        temp = ID(maxPrice, Proc, danych.PROCESSOR, 7, 0.2);
        Sid += temp;
        Sid += ",";
        Sid += Price(temp);
        Sid += ",";
        Sid += Socket(temp);
        Sid += ",";
        Sid += Power(temp);
        Sid += ";";
        return Sid;
    }
    public double PriceRam(int id) {
        String p = danych.RAM[id][6];
        return Double.parseDouble(p);
    }
    public String Ram(double maxPrice) {
        String Sid="";
        double temp2=0;
        int temp;
        boolean ok=true;
        while (ok){
            temp = ID(maxPrice, Ram, danych.RAM, 6, 0.15);
            Sid += temp;
            Sid += ",";
            Sid += PriceRam(temp);
            temp2 += PriceRam(temp);
            Sid += ";";
            if(maxPrice*0.1-temp2<300) ok=false;
        }
        return Sid;
    }
    public double PriceG(int id) {
        String p = danych.GRAPHICCARD[id][7];
        return Double.parseDouble(p);
    }
    public int PowerG(int id) {
        String p = danych.GRAPHICCARD[id][5];
        return Integer.parseInt(p);
    }
    public String Gcard(double maxPrice) {
        String Sid="";
        int temp;
        double temp2=0;
        boolean ok=true;
        while (ok){
            temp = ID(maxPrice, GraphCard, danych.GRAPHICCARD, 7, 0.15);
            Sid += temp;
            Sid += ",";
            Sid += PriceG(temp);
            temp2 += PriceG(temp);
            Sid += ",";
            Sid += PowerG(temp);
            Sid += ";";
            if(maxPrice*0.1-temp2<270) ok=false;
        }
        return Sid;
    }
    public String Os(double maxPrice) {
        String Sid="";
        int temp;
        temp = ID(maxPrice, OS, danych.OS, 6, 0.1);
        Sid += temp;
        Sid += ",";
        Sid += Double.parseDouble(danych.OS[temp][6]);
        Sid += ";";
        return Sid;
    }
    public String Ni(double maxPrice) {
        String Sid="";
        int temp;
        temp = ID(maxPrice, NiC, danych.NIC, 6, 0.1);
        Sid += temp;
        Sid += ",";
        Sid += Double.parseDouble(danych.NIC[temp][6]);
        Sid += ";";
        return Sid;
    }
    public String Mb(String processor, double maxPrice){
        String Sid="";
        int temp;
        temp = ID(maxPrice, MB, danych.MOTHERBOARD, 7, 0.15);
        while(!(danych.MOTHERBOARD[temp][4].equals(processor)))
        {
            temp=ID(maxPrice, MB, danych.MOTHERBOARD, 7, 0.15);
        }
        Sid += temp;
        Sid += ",";
        Sid += Double.parseDouble(danych.MOTHERBOARD[temp][7]);
        Sid += ";";
        return Sid;
    }
    public double PriceHD(int id) {
        String p = danych.HARDDRIVE[id][5];
        return Double.parseDouble(p);
    }
    public String Hdd(double maxPrice) {
        String Sid="";
        int temp;
        double temp2=0;
        boolean ok=true;
        while (ok){
            temp = ID(maxPrice, HD, danych.HARDDRIVE, 5, 0.15);
            Sid += temp;
            Sid += ",";
            Sid += PriceHD(temp);
            temp2 += PriceHD(temp);
            Sid += ";";
            if(maxPrice*0.15-temp2<280) ok=false;
        }
        return Sid;
    }
    public double PricePS(int id) {
        String p = danych.POWERSUPPLY[id][5];
        return Double.parseDouble(p);
    }
    public String Psupp(double Pow, double maxPrice) {
        String Sid="";
        Pow += 100; //rezerwa mocy
        int temp;
        temp = ID(maxPrice, PS, danych.POWERSUPPLY, 5, 0.15);
        while(!(Double.parseDouble(danych.POWERSUPPLY[temp][3]) >= Pow))
        {
            temp=ID(maxPrice, PS, danych.POWERSUPPLY, 5, 0.15);
        }
        Sid += temp;
        Sid += ",";
        Sid += PricePS(temp);
        Sid += ";";
        return Sid;
    }
    public double PriceC(int id) {
        String p = danych.CASE[id][8];
        return Double.parseDouble(p);
    }
    public String Ob(double maxPrice) {
        String Sid="";
        int temp;
        temp = ID(maxPrice, CA, danych.CASE, 8, 0.05);
        Sid += temp;
        Sid += ",";
        Sid += PriceC(temp);
        Sid += ";";
        return Sid;
    }
    // funkcja główna
    public String[] Start(double maxPrice) {
        // wybór oprogramowania
        double Price2=maxPrice-Price;
        // max cena proc 20%
        String Pro = Proc(Price2);
        StringTokenizer st0 = new StringTokenizer(Pro, ",;");
        while (st0.hasMoreTokens()) {
            Konf[0] += st0.nextToken() + ",";
            Price += Double.parseDouble(st0.nextToken());
            Socket += st0.nextToken();
            Power += Integer.parseInt(st0.nextToken());
        }
        // max cena ram 15%
        String Ram = Ram(Price2);
        StringTokenizer st2 = new StringTokenizer(Ram, ",;");
        while (st2.hasMoreTokens()) {
            Konf[2] += st2.nextToken() + ",";
            Price += Double.parseDouble(st2.nextToken());
            Power += 5;
        }
        // max cena grafika 15%
        String Gc = Gcard(Price2);
        StringTokenizer st3 = new StringTokenizer(Gc, ",;");
        while (st3.hasMoreTokens()) {
            Konf[3] += st3.nextToken() + ",";
            Price += Double.parseDouble(st3.nextToken());
            Power += Integer.parseInt(st3.nextToken());
        }
        // max cena płyta główna 15%
        String Moth = Mb(Socket, Price2);
        StringTokenizer st1 = new StringTokenizer(Moth, ",;");
        while (st1.hasMoreTokens()) {
            Konf[1] += st1.nextToken() + ",";
            Price += Double.parseDouble(st1.nextToken());
            Power += 50;
        }
        // max cena system 10%
        String Os = Os(Price2);
        StringTokenizer st8 = new StringTokenizer(Os, ",;");
        while (st8.hasMoreTokens()) {
            Konf[8] += st8.nextToken() + ",";
            Price += Double.parseDouble(st8.nextToken());
        }
        // karta sieciowa 10%
        String Ni = Ni(Price2);
        StringTokenizer st11 = new StringTokenizer(Ni, ",;");
        while (st11.hasMoreTokens()) {
            Konf[11] += st11.nextToken() + ",";
            Price += Double.parseDouble(st11.nextToken());
            Power += 3;
        }
        // max cena SSD 15%
        String Hdd = Hdd(Price2);
        StringTokenizer st5 = new StringTokenizer(Hdd, ",;");
        while (st5.hasMoreTokens()) {
            Konf[5] += st5.nextToken() + ",";
            Price += Double.parseDouble(st5.nextToken());
            Power += 10;
        }
        // max cena zasilacz 15%
        String Psu = Psupp(Power, Price2);
        StringTokenizer st14 = new StringTokenizer(Psu, ",;");
        while (st14.hasMoreTokens()) {
            Konf[14] += st14.nextToken() + ",";
            Price += Double.parseDouble(st14.nextToken());
        }
        // max cena obudowy 5%
        String Ca = Ob(Price2);
        StringTokenizer st4 = new StringTokenizer(Ca, ",;");
        while (st4.hasMoreTokens()) {
            Konf[4] += st4.nextToken() + ",";
            Price += Double.parseDouble(st4.nextToken());
        }
        double Price3=maxPrice-Price;
        System.out.println("Pozostało Ci: "+Price3);
        System.out.println("Wybierz teraz oprogramowanie\n");
        // oprogramowanie, max cena reszta
        String Sof = Sof(Price3);
        StringTokenizer st9 = new StringTokenizer(Sof, ",;");
        while (st9.hasMoreTokens()) {
            Konf[9] += st9.nextToken() + ",";
            Price += Double.parseDouble(st9.nextToken());
        }

        // wypisanie konfiguracji
        System.out.println();
        System.out.println("Konfiguracja: "+Konf[0]+"|"+Konf[1]+"|"+Konf[2]+"|"+Konf[3]+"|"+Konf[4]+"|"+Konf[5]+"|"+Konf[6]+"|"+Konf[7]+"|"+Konf[8]+"|"+Konf[9]+"|"+Konf[10]+"|"+Konf[11]+"|"+Konf[12]+"|"+Konf[13]+"|"+Konf[14]);
        System.out.println("Cena: "+Price);
        System.out.println("Moc: "+Power);
        String [] RET = new String[17];
        RET[15] = String.valueOf(Price);
        RET[16] = String.valueOf(Power);
        for(int i=0; i<15; i++)
            RET[i]=Konf[i];
        return RET;
    }

}