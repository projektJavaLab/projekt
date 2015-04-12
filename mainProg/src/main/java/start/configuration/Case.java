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
        String p = danych.CASE[id][2];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        return id-1;
    }
    public String Acc() {
        String Sid="";
        List();
        int temp;
        while (true){
            temp = ID();
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Price(temp);
            Sid += ";";
        }
        return Sid;
    }
}
