package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class Case extends Main{
    public void List() {
        System.out.println("ID || PRODUCENT || MODEL || PORTY 525 || PORTY 35 || MAX WYS. || CHLODZENIA || STAN MAGAZYNOWY || CENA");
        output.writeStringTab(danych.CASE);
    }
    public double Price(int id) {
        String p = danych.CASE[id][8];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części");
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
        if(danych.CASE.length < id || id < 1)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            return ID();
        }
        return id-1;
    }
    public String Do() {
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
