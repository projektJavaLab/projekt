package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class Adds extends Main{
    public void List() {
        System.out.println("ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ");
        output.writeStringTab(danych.ACCESSORY);
    }
    public double Price(int id) {
        String p = danych.ACCESSORY[id][2];
        return Double.parseDouble(p);
    }
    public int ID() {
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
            return ID();
        }
        return id-1;
    }
    public String Acc() {
        String Sid="";
        List();
        int temp;
        while (true){
            temp = ID();
            while(danych.ACCESSORY.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID();
            }
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Price(temp);
            Sid += ";";
        }
        return Sid;
    }
    public String Scr() {
        String Sid="";
        System.out.println("ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ");
        output.writeStringTab(danych.SCREEN);
        int temp;
        while (true){
            temp = ID();
            while(danych.SCREEN.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID();
            }
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.SCREEN[temp][2]);
            Sid += ";";
        }
        return Sid;
    }
    public String Sof() {
        String Sid="";
        System.out.println("ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ");
        output.writeStringTab(danych.SOFTWARE);
        int temp;
        while (true){
            temp = ID();
            while(danych.SOFTWARE.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID();
            }
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.SOFTWARE[temp][2]);
            Sid += ";";
        }
        return Sid;
    }
    public String Os() {
        String Sid="";
        System.out.println("ID || NAZWA || TYP || LICENCJA || WERSJA JĘZYKOWA || STAN MAG. || CENA");
        output.writeStringTab(danych.OS);
        int temp;
        temp = ID();
        while(danych.OS.length < temp+1 || temp+1 < 0)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            temp=ID();
        }
        if(temp!=-1) {
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.OS[temp][6]);
            Sid += ";";
        }
        return Sid;
    }
    public String Co() {
        String Sid="";
        System.out.println("ID || PRODUCENT || MODEL || RODZAJ || ROZMIAR || STAN MAG. || CENA");
        output.writeStringTab(danych.COOLING);
        int temp;
        while (true) {
            temp = ID();
            while(danych.COOLING.length < temp+1 || temp+1 < 0)
            {
                System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
                temp=ID();
            }
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.COOLING[temp][6]);
            Sid += ";";
        }
        return Sid;
    }
    public String Ni() {
        String Sid="";
        System.out.println("ID || PRODUCENT || MODEL || RODZAJ || PREDKOSC || STAN MAG. || CENA");
        output.writeStringTab(danych.NIC);
        int temp;
        temp = ID();
        while(danych.NIC.length < temp+1 || temp+1 < 0)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            temp=ID();
        }
        if(temp!=-1) {
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.NIC[temp][6]);
            Sid += ";";
        }
        return Sid;
    }
    public String Sou() {
        String Sid="";
        System.out.println("ID || PRODUCENT || MODEL || SNR || WYJSCIE OPTYCZNE || WZMACNIACZ SLUCHAWKOWY || STAN MAG. || CENA");
        output.writeStringTab(danych.SOUNDCARD);
        int temp;
        temp = ID();
        while(danych.SOUNDCARD.length < temp+1 || temp+1 < 0)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            temp=ID();
        }
        if(temp!=-1) {
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.SOUNDCARD[temp][7]);
            Sid += ";";
        }
        return Sid;
    }
    public String Dr() {
        String Sid="";
        System.out.println("ID || NAZWA || TYP || TECHNOLOGIA || INTERFEJS || STAN MAG. || CENA");
        output.writeStringTab(danych.DRIVE);
        int temp;
        temp = ID();
        while(danych.DRIVE.length < temp+1 || temp+1 < 0)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            temp=ID();
        }
        if(temp!=-1) {
            Sid += temp;
            Sid += ",";
            Sid += Double.parseDouble(danych.DRIVE[temp][7]);
            Sid += ";";
        }
        return Sid;
    }
}
