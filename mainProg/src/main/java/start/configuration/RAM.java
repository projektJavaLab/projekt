package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class RAM extends Main{
    public void List() {
        System.out.println("ID || TYP || PRODUCENT || ROZMIAR || TAKTOWANIE || STAN MAGAZYNOWY || CENA");
        output.writeStringTab(danych.RAM);
    }

    public double Price(int id) {
        String p = danych.RAM[id][2];
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
