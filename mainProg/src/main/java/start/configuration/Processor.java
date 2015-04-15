package start.configuration;

import start.baza.danych;
import start.output;
import java.util.Scanner;

public class Processor extends Main {
    public void List() {
        System.out.println("ID || PRODUCENT || MODEL || RDZENIE || TAKTOWANIE || SOCKET || STAN MAGAZYNOWY || CENA");
        output.writeStringTab(danych.PROCESSOR);
    }
    public double Price(int id) {
        String p = danych.GRAPHICCARD[id][7];
        return Double.parseDouble(p);
    }
    public String Socket(int id){
        return danych.GRAPHICCARD[id][5];
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        return id-1;
    }
    public String Proc(){
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
            Sid += Socket(temp);
            Sid += ";";
        }
        return Sid;
    }
}
