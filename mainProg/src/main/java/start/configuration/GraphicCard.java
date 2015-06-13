package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class GraphicCard extends Main{
    public void List() {
        System.out.println("ID || PRODUCENT || GEFORCE/RADEON || MODEL || PAMIĘĆ (GB) || POBÓR MOCY || STAN MAGAZYNOWY || CENA");
        output.writeStringTab(danych.GRAPHICCARD);
    }
    public double Price(int id) {
        String p = danych.GRAPHICCARD[id][7];
        return Double.parseDouble(p);
    }
    public int Power(int id) {
        String p = danych.GRAPHICCARD[id][5];
        return Integer.parseInt(p);
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
        if(danych.GRAPHICCARD.length < id || id < 0)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            return ID();
        }
        return id-1;
    }
    public String Gcard() {
        String Sid="";
        List();
        int temp;
        while (true){
            temp = ID();
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Price(temp);
            Sid += ",";
            Sid += Power(temp);
            Sid += ";";
        }
        return Sid;
    }
}
