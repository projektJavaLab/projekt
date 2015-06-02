package start.dynamic;

import start.configuration.Adds;
import start.baza.danych;
import start.configuration.Processor;
import start.output;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class HighCompany {
    // cena
    public static double Price = 0;
    // moc
    int Power = 0;
    String Socket="";
    // tablica przechowująca indexy do częsci
    // 0-procesor, 1-płyta główna, 2-ram, 3-obudowa, 4-zasilacz, 5-dysk, 6-karta graficzna, 7-akcesoria, 8-monitory, 9-oprogramowanie, 10-systemy, 11-chłodzenie, 12-karty sieciowe, 13-karty dźwiękowe, 14-napędy
    public static String[] Konf= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "" };
    // tablic możliwych procesorów
    public int [] Proc = new int[]{3,4,12,13,14,15,16,17,18,19,20};
    // tablica możliwych RAM
    public int [] Ram = new int[]{1,2,3,4,5};
    // tablica możliwych kart graficznych
    public int [] GraphCard = new int[]{1,2,3,6,7};
    // tablica możliwych kart sieciowych
    public int [] NiC = new int[]{1,2,3,4};
    // tablica możliwych systemów operacyjnych
    public int [] OS = new int[]{1,2,3,4,5,6,7,8};
    // tablica możliwych płyt głównych
    public int [] MB = new int[]{1,2,3,4,5,6,7,8,9,10};
    // tablica możluwych dysków
    public int [] HD = new int[]{6,7,8,9,10};
    // wybór akcesoriów
    public static void Acc (double maxPrice) {
        Price=0;
        Konf[9]="";
        Adds adds = new Adds();
        System.out.println("Najpierw wybierz oprogramowanie, które chcesz mieć w komputerze. Pamietaj, że max kwota która pozostanie na resztę części musi być równa min. 3500");
        String Sof = adds.Sof();
        StringTokenizer st9 = new StringTokenizer(Sof, ",;");
        while (st9.hasMoreTokens()) {
            Konf[9] += st9.nextToken() + ",";
            Price += Double.parseDouble(st9.nextToken());
        }
        if(maxPrice-Price<3500)
        {
            System.out.println("Musisz wybrać inne bądź żadne oprogramowanie, ponieważ nie wystarczy na konfigurację komputera!");
            Acc(maxPrice);
        }
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
    public String Proc(double maxPrice){
        String Sid="";
        int temp;
        temp = ID(maxPrice, Proc, danych.PROCESSOR, 7, 0.3);
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
            temp = ID(maxPrice, Ram, danych.RAM, 6, 0.1);
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
            temp = ID(maxPrice, GraphCard, danych.GRAPHICCARD, 7, 0.1);
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
        temp = ID(maxPrice, MB, danych.MOTHERBOARD, 7, 0.1);
        while(!(danych.MOTHERBOARD[temp][4].equals(processor)))
        {
            temp=ID(maxPrice, MB, danych.MOTHERBOARD, 7, 0.1);
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
    // funkcja główna
    public void Start(double maxPrice) {
        // wybór oprogramowania
        Acc(maxPrice);
        double Price2=maxPrice-Price;
        // max cena proc 30%
        String Pro = Proc(Price2);
        StringTokenizer st0 = new StringTokenizer(Pro, ",;");
        while (st0.hasMoreTokens()) {
            Konf[0] += st0.nextToken() + ",";
            Price += Double.parseDouble(st0.nextToken());
            Socket += st0.nextToken();
            Power += Integer.parseInt(st0.nextToken());
        }
        // max cena ram 10%
        String Ram = Ram(Price2);
        StringTokenizer st2 = new StringTokenizer(Ram, ",;");
        while (st2.hasMoreTokens()) {
            Konf[2] += st2.nextToken() + ",";
            Price += Double.parseDouble(st2.nextToken());
            Power += 5;
        }
        // max cena grafika 10%
        String Gc = Gcard(Price2);
        StringTokenizer st3 = new StringTokenizer(Gc, ",;");
        while (st3.hasMoreTokens()) {
            Konf[3] += st3.nextToken() + ",";
            Price += Double.parseDouble(st3.nextToken());
            Power += Integer.parseInt(st3.nextToken());
        }
        // max cena płyta główna 10%
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
        // karta sieciowa
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
        // max cena zasilacz 10%

        // zostało 5%!
    }

}