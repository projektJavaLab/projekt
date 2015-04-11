package start.configuration;

import start.baza.danych;
import start.output;

public class Adds extends Main{
    public void List() {
        System.out.println("ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ");
        output.writeStringTab(danych.ACCESSORY);
    }
    public double Price(int id) {
        double price = 0;
        return price;
    }
    public int ID() {
        int id=0;
        return id;
    }
    public String Do() {
        String Sid="";
        List();
        Sid += ID();
        System.out.println(Sid);
        return Sid;
    }
}
