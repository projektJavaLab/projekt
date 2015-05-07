package start.configuration;

import start.baza.danych;
import start.output;
import java.util.Scanner;

public class Processor extends Main {
    public void List() {
        System.out.println("ID || PRODUCENT || MODEL || RDZENIE || TAKTOWANIE || SOCKET || STAN MAGAZYNOWY || CENA || TDP");
        output.writeStringTab(danych.PROCESSOR);
    }
    public double Price(int id) {
        String p = danych.PROCESSOR[id][7];
        return Double.parseDouble(p);
    }
    public int Power(int id) {
        String p = danych.PROCESSOR[id][8];
        return Integer.parseInt(p);
    }
    public String Socket(int id){
        return danych.PROCESSOR[id][5];
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
        if(danych.PROCESSOR.length < id || id < 1)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            return ID();
        }
        return id-1;
    }
    public String Proc(){
        String Sid="";
        List();
        int temp;
        temp = ID();
        Sid += temp;
        Sid += ",";
        Sid += Price(temp);
        Sid += ",";
        Sid += Socket(temp);
        Sid += ",";
        Sid += Power(temp);
        Sid += ";";
        return Sid;
    }
}
