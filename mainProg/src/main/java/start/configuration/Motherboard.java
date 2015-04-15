package start.configuration;

import start.baza.danych;
import start.output;
import java.util.Scanner;


public class Motherboard extends Main {
    public void List() {
        System.out.println("ID || PRODUCENT || MODEL || CHIPSET || SOCKET || FORMAT || STAN MAG. || CENA");
    }
    public double Price(int id) {
        String p = danych.MOTHERBOARD[id][7];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        return id-1;
    }
    public String Mb(String processor){
        String Sid="";
        List();
        output.writeStringTabSelect(danych.MOTHERBOARD, 4, processor);
        //output.writeStringTab(danych.MOTHERBOARD);
        int temp;
            temp = ID();
            Sid += temp;
            Sid += ",";
            Sid += Price(temp);
            Sid += ";";
        return Sid;
    }
}
