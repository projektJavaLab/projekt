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
        id = in.nextInt();
        return id-1;
    }
    public String Do() {
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
