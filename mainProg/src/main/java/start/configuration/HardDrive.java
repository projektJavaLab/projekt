package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class HardDrive extends Main{
    public void List() {
        System.out.println("ID || TYP || PRODUCENT || POJEMNOŚĆ (TB) || STAN MAGAZYNOWY || CENA");
        output.writeStringTab(danych.HARDDRIVE);
    }
    public double Price(int id) {
        String p = danych.HARDDRIVE[id][5];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        return id-1;
    }
    public String Hdd() {
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
