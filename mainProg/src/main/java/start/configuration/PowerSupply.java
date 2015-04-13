package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class PowerSupply extends Main{
    public void List() {
        System.out.println("ID || Nazwa || Producent || MOC || STAN MAG. || CENA");
        output.writeStringTab(danych.POWERSUPPLY);
    }
    public double Price(int id) {
        String p = danych.POWERSUPPLY[id][5];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        return id-1;
    }
    public String Psupp() {
        String Sid="";
        List();
        int temp;
        temp = ID();
        Sid += temp;
        Sid += ",";
        Sid += Price(temp);
        Sid += ";";
        return Sid;
    }
}
